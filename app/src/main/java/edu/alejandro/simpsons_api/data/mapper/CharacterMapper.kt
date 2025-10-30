package edu.alejandro.simpsons_api.data.mapper

import edu.alejandro.simpsons_api.data.model.SimpsonsCharacterDto
import edu.alejandro.simpsons_api.domain.model.SimpsonsCharacter

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