package com.example.demo

import kotlin.random.Random

const val LIMIT = 10
data class Numbers(
    val name: String,
    val draw1: Int = Random.nextInt(1, LIMIT),
    val draw2: Int = Random.nextInt(1, LIMIT + 1 - draw1)
) {

}
