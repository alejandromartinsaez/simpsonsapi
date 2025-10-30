package edu.alejandro.simpsons_api.presentation.viewmodel

sealed class UiState {
    object Idle : UiState()
    object Loading : UiState()
    data class Success(val data: List<*>) : UiState() // replace List<Any> with your model, e.g. List<Character>
    data class Error(val message: String) : UiState()
}