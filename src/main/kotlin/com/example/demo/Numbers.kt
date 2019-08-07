package com.example.demo

import kotlin.random.Random


data class Numbers(
    val name: String,
    val draw1: Int = Random.nextInt(1, LIMIT),
    val draw2: Int = Random.nextInt(1, LIMIT - draw1 + 1)
) {
    companion object {
        const val LIMIT = 50
    }
}
