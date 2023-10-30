package com.example.myfirstkmm.presentation

import com.example.myfirstkmm.model.Movie
import com.example.myfirstkmm.model.MoviesList

data class MovieListState(
    val movies: MoviesList = MoviesList(),
    val selectedMovie: Movie? = null
)
