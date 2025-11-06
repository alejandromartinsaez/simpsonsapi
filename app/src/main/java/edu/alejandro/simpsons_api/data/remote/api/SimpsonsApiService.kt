package edu.alejandro.simpsons_api.data.remote.api

import retrofit2.Response
import retrofit2.http.GET

interface SimpsonsApiService {
    @GET("characters")
    suspend fun getCharacters(): Result<List<SimpsonsCharacterDto>>
}