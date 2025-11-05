package edu.alejandro.simpsons_api.data.remote.api

import retrofit2.Response
import retrofit2.http.GET

interface SimpsonsApiService {
    @GET
    suspend fun getCharacters(): Response<List<SimpsonsCharacterDto>>

    @GET
    suspend fun getCharacterById(): Response<SimpsonsCharacterDto>
}