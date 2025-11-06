package edu.alejandro.simpsons_api.domain

import edu.alejandro.simpsons_api.domain.SimpsonsCharacter

interface SimpsonsRepository {
    suspend fun getCharacters(): Result<List<SimpsonsCharacter>>
}