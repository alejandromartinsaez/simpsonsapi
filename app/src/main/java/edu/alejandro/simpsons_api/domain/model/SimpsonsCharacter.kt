package edu.alejandro.simpsons_api.domain.model

data class SimpsonsCharacter(
    val id: Int,
    val name: String,
    val age: Int?,
    val occupation: String?,
    val status: String?,
    val portraitUrl: String?,
    val phrases: List<String>
)
