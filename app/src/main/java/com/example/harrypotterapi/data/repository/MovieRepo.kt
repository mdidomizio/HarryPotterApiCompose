package com.example.harrypotterapi.data.repository

import com.example.harrypotterapi.data.api.MovieApi
import com.example.harrypotterapi.data.api.model.Movie
import javax.inject.Inject

class MovieRepo @Inject constructor(
    private val movieApi: MovieApi
){
    suspend fun getMovie():List<Movie>{
        return movieApi.getMovie()
    }
}
