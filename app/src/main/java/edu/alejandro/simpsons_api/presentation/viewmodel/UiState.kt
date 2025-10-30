package edu.alejandro.simpsons_api.presentation.viewmodel

    sealed class UiState {
        object Idle : UiState()
        object Loading : UiState()
        data class Success<T>(val data: T) : UiState()
        data class Error(val message: String) : UiState()
    }