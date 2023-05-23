package com.example.myfirstkmm.model

import kotlinx.serialization.Serializable


@Serializable
data class PrimaryImage(
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)

@Serializable
data class ReleaseYear(
    val year: Int
)

@Serializable
data class ReleaseDate(
    val day: Int?,
    val month: Int?,
    val year: Int?
)

@Serializable
data class TitleText(
    val text: String
)

@Serializable
data class RatingsSummary(
    val aggregateRating: Float,
    val voteCount: Int
)

@Serializable
data class Genres(
    val genres: List<Genre>
)

@Serializable
data class Genre(
    val id: String,
    val text: String
)

@Serializable
data class Plot(
    val plotText: PlotText
)

@Serializable
data class PlotText(
    val plainText: String
)