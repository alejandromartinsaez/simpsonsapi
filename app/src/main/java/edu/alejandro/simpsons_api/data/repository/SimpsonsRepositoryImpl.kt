package edu.alejandro.simpsons_api.data.repository

import edu.alejandro.simpsons_api.data.remote.RetrofitClient
import edu.alejandro.simpsons_api.data.remote.SimpsonsApiService
import edu.alejandro.simpsons_api.domain.model.SimpsonsCharacter
import edu.alejandro.simpsons_api.domain.repository.SimpsonsRepository

class SimpsonsRepositoryImpl (private val api: SimpsonsApiService = RetrofitClient.api) :
    SimpsonsRepository {
    override suspend fun getCharacters(): Result<List<SimpsonsCharacter>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCharacterById(id: Int): Result<SimpsonsCharacter> {
        TODO("Not yet implemented")
    }


}