package com.example.demo

import org.junit.jupiter.api.Test

class NumbersTest {

    @Test
    fun `should be able to create a numbers instance`() {
        for (i in 1 .. 100) {
            val numbers = Numbers("Foo")
            println(numbers)
        }
    }
 }
