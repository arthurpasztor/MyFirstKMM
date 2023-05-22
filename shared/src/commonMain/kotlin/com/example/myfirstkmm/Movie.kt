package com.example.myfirstkmm

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
    val originalTitleText: OriginalTitleText,
    val primaryImage: PrimaryImage?,
    val releaseDate: ReleaseDate?,
    val releaseYear: ReleaseYear,
    val titleText: TitleText,
    val titleType: TitleType
)

@Serializable
data class OriginalTitleText(
    val __typename: String,
    val text: String
)

@Serializable
data class PrimaryImage(
    val __typename: String,
    val caption: Caption,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)

@Serializable
data class ReleaseDate(
    val __typename: String,
    val day: Int?,
    val month: Int?,
    val year: Int
)

@Serializable
data class ReleaseYear(
    val __typename: String,
    val endYear: String?,
    val year: Int
)

@Serializable
data class TitleText(
    val __typename: String,
    val text: String
)

@Serializable
data class TitleType(
    val __typename: String,
    val id: String,
    val isEpisode: Boolean,
    val isSeries: Boolean,
    val text: String
)

@Serializable
data class Caption(
    val __typename: String,
    val plainText: String
)
