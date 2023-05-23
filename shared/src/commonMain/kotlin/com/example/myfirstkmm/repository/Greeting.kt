package com.example.myfirstkmm.repository

import com.example.myfirstkmm.network.HttpClient.httpClient
import com.example.myfirstkmm.platform.Platform
import com.example.myfirstkmm.model.RocketLaunch
import com.example.myfirstkmm.utils.daysUntilNewYear
import com.example.myfirstkmm.platform.getPlatform
import io.ktor.client.call.body
import io.ktor.client.request.get

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

    companion object {
        private const val API_URL = "https://api.spacexdata.com/v4/launches"
    }
}