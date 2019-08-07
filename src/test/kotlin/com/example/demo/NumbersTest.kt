package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumbersTest {

    @Test
    fun `should be able to create a numbers instance`() {
        for (i in 1 .. 100) {
            val numbers = Numbers("Foo")
            assertThat(numbers.pennies1).isBetween(1, Numbers.PENNIES - 1)
            assertThat(numbers.pennies2).isBetween(1, Numbers.PENNIES - 1)
            assertThat(numbers.pennies1 + numbers.pennies2).isLessThanOrEqualTo(Numbers.PENNIES)
            println(numbers)
        }
    }
 }
