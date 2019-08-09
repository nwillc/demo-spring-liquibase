package com.example.demo

import com.beust.klaxon.Klaxon
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import org.springframework.boot.actuate.health.Health

class JsonTest {
    @Test
    fun `should handle Java types`() {
        val health = Health.up().build()
        println(health)
        println(Gson().toJson(health))
        println(Klaxon().toJsonString(health))
    }
}
