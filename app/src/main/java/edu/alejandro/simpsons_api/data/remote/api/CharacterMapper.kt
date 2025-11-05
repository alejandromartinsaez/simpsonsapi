package edu.alejandro.simpsons_api.data.remote.api

import edu.alejandro.simpsons_api.domain.SimpsonsCharacter

class CharacterMapper {
    fun SimpsonsCharacterDto.toDomain() = SimpsonsCharacter(
        id = id,
        name = name,
        age = age,
        occupation = occupation,
        status = status,
        portraitUrl = portrait?.let { "https://thesimpsonsapi.com$it" },
        phrases = phrases ?: emptyList()
    )
}