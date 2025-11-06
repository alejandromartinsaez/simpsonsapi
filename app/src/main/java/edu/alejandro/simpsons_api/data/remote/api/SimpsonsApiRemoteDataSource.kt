package edu.alejandro.simpsons_api.data.remote.api
import edu.alejandro.simpsons_api.domain.SimpsonsCharacter

class SimpsonsApiRemoteDataSource (private val apiService: SimpsonsApiService) {
    suspend fun getCharacters(): Result<Result<List<SimpsonsCharacterDto>>> {
        return try {
            val characters = apiService.getCharacters()
            Result.success(characters)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}