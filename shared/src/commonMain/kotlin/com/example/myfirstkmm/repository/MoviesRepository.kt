package com.example.myfirstkmm.repository

import com.example.myfirstkmm.network.HttpClient.httpClient
import com.example.myfirstkmm.model.MovieDetails
import com.example.myfirstkmm.model.MoviesList
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.http.URLBuilder
import io.ktor.http.URLProtocol
import io.ktor.http.appendPathSegments
import kotlinx.coroutines.flow.Flow

object MoviesRepository {

    suspend fun getMoviesList(): MoviesList {
        return httpClient.get {
            url {
                extracted(this, this@get)
                appendPathSegments("titles")
                parameters.append("page", "1")
                parameters.append("limit", "20")
            }
        }.body()
    }

    suspend fun getMovie(id: String): MovieDetails {
        return httpClient.get {
            url {
                extracted(this, this@get)
                appendPathSegments("titles")
                appendPathSegments(id)
                parameters.append("info", "base_info")
            }
        }.body()
    }

    suspend fun getMoviesFlow(): Flow<MoviesList> {
        return httpClient.get {
            url {
                extracted(this, this@get)
                appendPathSegments("titles")
                parameters.append("page", "1")
                parameters.append("limit", "20")
            }
        }.body()
    }

    private fun extracted(urlBuilder: URLBuilder, httpRequestBuilder: HttpRequestBuilder) {
        urlBuilder.protocol = URLProtocol.HTTPS
        urlBuilder.host = "moviesdatabase.p.rapidapi.com"
        httpRequestBuilder.headers {
            append(
                "X-RapidAPI-Key",
                "eb618a4538msh282f3ce40175bafp1a90dbjsnd7b0b75298b9"
            )
        }
    }
}