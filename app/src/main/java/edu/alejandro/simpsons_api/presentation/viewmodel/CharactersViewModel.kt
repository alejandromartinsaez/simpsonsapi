package edu.alejandro.simpsons_api.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.alejandro.simpsons_api.domain.usecase.GetCharactersByIdUseCase
import edu.alejandro.simpsons_api.domain.usecase.GetCharactersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharactersViewModel (private val getCharactersUseCase: GetCharactersUseCase, private val getCharactersByIdUseCase: GetCharactersByIdUseCase) : ViewModel() {
    private val _state = MutableStateFlow<UiState>(UiState.Idle)
    val state: StateFlow<UiState> = _state

    fun loadCharacters(page: Int = 1) {
        viewModelScope.launch {
            _state.value = UiState.Loading
            when (val result = getCharactersUseCase()) {
                is Resuu -> _state.value = UiState.Success(result.data)
                is Result.ApiError -> _state.value = UiState.Error("Error ${result.code}")
                is Result.NetworkError -> _state.value = UiState.Error("Network issue")
                is Result.UnknownError -> _state.value = UiState.Error("Unknown error")
            }
        }
    }

}