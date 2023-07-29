package com.example.harrypotterapi.data.api

import com.example.harrypotterapi.data.api.model.Movie
import retrofit2.http.GET

interface MovieApi {

    @GET(ApiConstants.END_POINTS)
    suspend fun getMovie():List<Movie>
}