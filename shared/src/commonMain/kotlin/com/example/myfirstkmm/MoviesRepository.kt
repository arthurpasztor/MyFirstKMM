package com.example.myfirstkmm

import com.example.myfirstkmm.HttpClient.httpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.http.URLProtocol
import io.ktor.http.appendPathSegments

class MoviesRepository {

    suspend fun getMoviesList(): MoviesList {
        val response: MoviesList = httpClient.get {
            url {
                protocol = URLProtocol.HTTPS
                host = "moviesdatabase.p.rapidapi.com"
                appendPathSegments("titles")
                parameters.append("page", "1")
                parameters.append("limit", "20")
                headers {
                    append("X-RapidAPI-Key", "eb618a4538msh282f3ce40175bafp1a90dbjsnd7b0b75298b9")
                    append("X-RapidAPI-Host", "moviesdatabase.p.rapidapi.com")
                }
            }
        }.body()

        return response
    }
}