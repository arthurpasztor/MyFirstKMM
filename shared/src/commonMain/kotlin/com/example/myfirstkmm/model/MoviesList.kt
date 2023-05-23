package com.example.myfirstkmm.model

import kotlinx.serialization.Serializable

@Serializable
data class MoviesList(
    val page: String,
    val entries: Int,
    val results: List<Movie>
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
