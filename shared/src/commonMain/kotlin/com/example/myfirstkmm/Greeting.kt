package com.example.myfirstkmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Guess what it is, ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} left until New Year! \uD83C\uDF86"
    }
}