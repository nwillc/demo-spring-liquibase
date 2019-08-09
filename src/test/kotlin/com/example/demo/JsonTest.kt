package com.example.demo

import com.beust.klaxon.Converter
import com.beust.klaxon.JsonValue
import com.beust.klaxon.Klaxon
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.Status

internal val klaxon: Klaxon = Klaxon()
    .converter(HealthConverter)
    .converter(StatusConverter)

class JsonTest {
    @Test
    fun `should handle Java types`() {
        val health = Health.up().build()
        println(health)
        println(Gson().toJson(health))
        println(klaxon.toJsonString(health))
    }
}

internal object StatusConverter : Converter {
    override fun canConvert(cls: Class<*>) = cls == Status::class.java

    override fun fromJson(jv: JsonValue): Any? {
        TODO("not implemented")
    }

    override fun toJson(value: Any): String {
        value as Status
        return """
            {"code":"${value.code}","description":"${value.description}"}
        """.trimIndent()
    }
}

internal object HealthConverter : Converter {
    override fun canConvert(cls: Class<*>) = cls == Health::class.java

    override fun fromJson(jv: JsonValue): Any? {
        TODO("not implemented")
    }

    override fun toJson(value: Any): String {
        value as Health
        return """{"status":${klaxon.toJsonString(value.status)},"details":${klaxon.toJsonString(value.details)}}"""
    }
}
