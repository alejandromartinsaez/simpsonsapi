package edu.alejandro.simpsons_api.data

import edu.alejandro.core.ApiClient
import edu.alejandro.simpsons_api.data.remote.api.SimpsonsApiRemoteDataSource
import edu.alejandro.simpsons_api.data.remote.api.SimpsonsApiService
import edu.alejandro.simpsons_api.domain.SimpsonsCharacter
import edu.alejandro.simpsons_api.domain.SimpsonsRepository

class SimpsonsLocalDataSourceRepository (private val api: SimpsonsApiRemoteDataSource) : SimpsonsRepository {
    override suspend fun getCharacters(): Result<List<SimpsonsCharacter>> {
        TODO("Not yet implemented")
    }

    override suspend fun getCharacterById(id: Int): Result<SimpsonsCharacter> {
        TODO("Not yet implemented")
    }


}