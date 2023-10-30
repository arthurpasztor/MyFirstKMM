package com.example.myfirstkmm

import com.example.myfirstkmm.platform.SharedViewModel
import com.example.myfirstkmm.platform.SharedViewModel2
import com.example.myfirstkmm.platform.scope
import com.example.myfirstkmm.presentation.MovieListState
import com.example.myfirstkmm.repository.MoviesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MoviesViewModel : SharedViewModel() {

    private var repo = MoviesRepository

    private val _state = MutableStateFlow(MovieListState())
    //TODO implement viewModel
//    val state = combine(
//        _state,
//        repo.getMoviesFlow()
//    ) { state, movies ->
//
//    }.stateIn(scope, SharingStarted.WhileSubscribed(5000L), MovieListState())
//
//    fun getMovies() {
//        scope.launch {
//
//        }
//    }
}
