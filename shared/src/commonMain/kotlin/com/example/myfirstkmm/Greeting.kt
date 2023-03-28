package com.example.myfirstkmm

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class Greeting {
    private val platform: Platform = getPlatform()

    fun oldGreet(): String {
        return "Guess what it is, ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} left until New Year! \uD83C\uDF86"
    }

    @Throws(Exception::class)
    suspend fun greet(): String {
        val rockets: List<RocketLaunch> = httpClient.get(API_URL).body()
        val lastSuccessLaunch = rockets.last { it.launchSuccess == true }
        return "Guess what it is, ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} left until New Year! \uD83C\uDF86" +
                "\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} \uD83D\uDE80"
    }

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    companion object {
        private const val API_URL = "https://api.spacexdata.com/v4/launches"
    }
}