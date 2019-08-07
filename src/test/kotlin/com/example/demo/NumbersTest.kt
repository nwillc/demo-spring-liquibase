package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumbersTest {

    @Test
    fun `should be able to create a numbers instance`() {
        for (i in 1 .. 100) {
            val numbers = Numbers("Foo")
            assertThat(numbers.draw1 + numbers.draw2).isLessThanOrEqualTo(Numbers.LIMIT)
            println(numbers)
        }
    }
 }
