package com.example.myfirstkmm.platform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform