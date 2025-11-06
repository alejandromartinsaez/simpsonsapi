package edu.alejandro.simpsons_api.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.alejandro.core.ErrorApp
import edu.alejandro.simpsons_api.domain.GetCharactersUseCase
import edu.alejandro.simpsons_api.domain.SimpsonsCharacter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val getCharactersUseCase: GetCharactersUseCase
) : ViewModel() {

    data class UiState(
        val isLoading: Boolean = true,
        val error: ErrorApp? = null,
        val success: Boolean? = null,
        val characters: List<SimpsonsCharacter> = emptyList()
    )

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun getAll() {
        viewModelScope.launch {
            _uiState.value = UiState(isLoading = true)
            val result = getCharactersUseCase.invoke()

            _uiState.value = when {
                result.isSuccess -> UiState(
                    isLoading = false,
                    success = true,
                    characters = result.getOrDefault(emptyList())
                )
                else -> UiState(
                    isLoading = false,
                    error = result.exceptionOrNull() as? ErrorApp,
                    success = false
                )
            }
        }
    }
}
// view holder, adapter, fragment, interfaz
