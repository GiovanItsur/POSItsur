package com.example.positsur

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform