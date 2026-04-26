package com.abransz.mypersonalpage

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform