// File: `CharactersViewModel.kt`
package edu.alejandro.simpsons_api.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.alejandro.simpsons_api.util.Result as DomainResult
import edu.alejandro.simpsons_api.domain.GetCharactersByIdUseCase
import edu.alejandro.simpsons_api.domain.GetCharactersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val getCharactersUseCase: GetCharactersUseCase,
    private val getCharactersByIdUseCase: GetCharactersByIdUseCase
) : ViewModel() {
    private val _state = MutableStateFlow<UiState>(UiState.Idle)
    val state: StateFlow<UiState> = _state

    fun loadCharacters(page: Int = 1) {
        viewModelScope.launch {
            _state.value = UiState.Loading
            when (val result = getCharactersUseCase(page)) {
                is DomainResult.Success<*> -> _state.value = UiState.Success(result.data as List<*>)
                is DomainResult.ApiError -> _state.value = UiState.Error("Error ${result.code}")
                is DomainResult.NetworkError -> _state.value = UiState.Error("Network issue")
                is DomainResult.UnknownError -> _state.value = UiState.Error("Unknown error")
            }
        }
    }
}
