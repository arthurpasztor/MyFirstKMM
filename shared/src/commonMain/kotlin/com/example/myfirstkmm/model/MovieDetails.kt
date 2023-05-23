package com.example.myfirstkmm.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieDetails(
    val results: Results
)

@Serializable
data class Results(
    val _id: String,
    val id: String,
    val ratingsSummary: RatingsSummary,
    val primaryImage: PrimaryImage?,
    val genres: Genres,
    val titleText: TitleText,
    val releaseYear: ReleaseYear,
    val releaseDate: ReleaseDate?,
    val plot: Plot?,
)
