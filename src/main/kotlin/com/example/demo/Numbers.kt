package com.example.demo

import kotlin.random.Random


data class Numbers(
    val name: String,
    val pennies1: Int = Random.nextInt(1, PENNIES),
    val pennies2: Int = Random.nextInt(1, PENNIES - pennies1 + 1)
) {
    companion object {
        const val PENNIES = 50
    }
}
