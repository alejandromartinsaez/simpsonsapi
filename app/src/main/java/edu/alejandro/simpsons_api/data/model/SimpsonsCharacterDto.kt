package edu.alejandro.simpsons_api.data.model

data class SimpsonsCharacterDto(
    val id: Int,
    val age: Int,
    val birthDate: String,
    val gender: String,
    val name: String,
    val occupation: String,
    val portrait: String,
    val phrases: List<String>,
    val status: String
)
