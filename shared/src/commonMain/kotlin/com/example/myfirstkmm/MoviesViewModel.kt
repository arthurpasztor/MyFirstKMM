package com.example.myfirstkmm

import com.example.myfirstkmm.platform.SharedViewModel
import com.example.myfirstkmm.repository.MoviesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MoviesViewModel : SharedViewModel() {

    private var repo = MoviesRepository

    private val _color = MutableStateFlow(0xFFFFFF)
    val color = _color.asStateFlow()

//    var composeColor by mutableStateOf()
}