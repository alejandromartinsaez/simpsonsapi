package edu.alejandro.simpsons_api.data.remote.api

import edu.alejandro.simpsons_api.domain.SimpsonsCharacter

class SimpsonsApiRemoteDataSource {
    suspend fun getCharacters(): Result<List<SimpsonsCharacter>> {
        TODO("Not yet implemented")
    }

    suspend fun getCharacterById(id: Int): Result<SimpsonsCharacter> {
        TODO("Not yet implemented")
    }
}