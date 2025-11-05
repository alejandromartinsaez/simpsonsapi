package edu.alejandro.simpsons_api.data.remote.api

import retrofit2.Response
import retrofit2.http.GET

interface SimpsonsApiService {
    @GET
    suspend fun getCharacters(): Response<List<SimpsonsCharacterDto>>

    @GET("character/{id}")
    suspend fun getCharacterById(@retrofit2.http.Path("id") id: Int): Response<SimpsonsCharacterDto>
}