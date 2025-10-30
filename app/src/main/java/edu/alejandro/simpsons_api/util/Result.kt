package edu.alejandro.simpsons_api.util

sealed class Result<out T> {
        data class Success<T>(val data: T) : Result<T>()
        data class ApiError(val code: Int, val message: String?) : Result<Nothing>()
        data class NetworkError(val exception: Throwable) : Result<Nothing>()
        object UnknownError : Result<Nothing>()
    }