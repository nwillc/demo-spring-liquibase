package com.example.demo

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id


@Entity
data class Person(
    @Id
    val id: UUID,
    val name: String,
    @Column(columnDefinition="TEXT")
    val json: String
)
