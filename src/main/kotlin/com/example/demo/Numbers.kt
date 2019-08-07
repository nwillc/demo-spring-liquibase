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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Numbers

        if (pennies1 != other.pennies1) return false
        if (pennies2 != other.pennies2) return false

        return true
    }

    override fun hashCode(): Int {
        var result = pennies1
        result = 31 * result + pennies2
        return result
    }

}
