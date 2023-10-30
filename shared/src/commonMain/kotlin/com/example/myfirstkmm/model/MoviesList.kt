package com.example.myfirstkmm.model

import kotlinx.serialization.Serializable

@Serializable
data class MoviesList(
    val page: String = "1",
    val entries: Int = 0,
    val results: List<Movie> = listOf()
)

@Serializable
data class Movie(
    val _id: String,
    val id: String,
    val primaryImage: PrimaryImage?,
    val releaseYear: ReleaseYear,
    val releaseDate: ReleaseDate?,
    val titleText: TitleText,
)
