package edu.alejandro.core

sealed class ErrorApp : Throwable() {
    object internetConnectionErrorApp : ErrorApp()
}