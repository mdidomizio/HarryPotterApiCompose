package com.example.harrypotterapi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.harrypotterapi.data.api.model.Movie
import com.example.harrypotterapi.data.repository.MovieRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieRepo: MovieRepo
): ViewModel() {
    private val _state = MutableStateFlow(emptyList<Movie>())
    val state: StateFlow<List<Movie>>
        get() = _state

    init {
        viewModelScope.launch {
            val movies = movieRepo.getMovie()
            _state.value = movies
        }
    }
}