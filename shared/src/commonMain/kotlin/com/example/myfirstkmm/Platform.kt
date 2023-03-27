package com.example.myfirstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform