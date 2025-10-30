package edu.alejandro.simpsons_api.domain.repository

import edu.alejandro.simpsons_api.domain.model.SimpsonsCharacter

interface SimpsonsRepository {
    suspend fun getCharacters(): Result<List<SimpsonsCharacter>>
    suspend fun getCharacterById(id: Int): Result<SimpsonsCharacter>
}