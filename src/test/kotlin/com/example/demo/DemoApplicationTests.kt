package com.example.demo

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner
import java.util.UUID

@RunWith(SpringRunner::class)
@ActiveProfiles(profiles = ["test"])
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	lateinit var perRepository: CustomerRepository

	@Test
	fun contextLoads() {
	}

	@Before
	fun setUp() {
		perRepository.deleteAll()
	}

	@Test
	fun `should save person`() {
		val person = Person(UUID.randomUUID(), "Wile Coyote", """
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.
			This is a really long text.						
		""".trimIndent())

		perRepository.save(person)
	}
}
