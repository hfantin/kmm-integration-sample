package com.github.hfantin.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform