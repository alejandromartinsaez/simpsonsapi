package edu.alejandro.simpsons_api.data.remote.api

import com.google.gson.annotations.SerializedName

data class SimpsonsCharacterDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("age")
    val age: Int,
    @SerializedName("occupation")
    val occupation: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("portrait")
    val portrait: String,
    @SerializedName("phrases")
    val phrases: List<String>
)