import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val assertjVarsion: String by project
val klaxonVersion: String by project
val jupiterVersion: String by project

plugins {
	id("org.springframework.boot") version "2.1.6.RELEASE"
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
	kotlin("jvm") version "1.3.41"
	kotlin("plugin.spring") version "1.3.41"
	id("org.jetbrains.kotlin.plugin.noarg") version "1.3.41"
	id("com.github.nwillc.vplugin") version "3.0.1"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	jcenter()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.liquibase:liquibase-core")
	implementation("com.beust:klaxon:5.0.11")
	implementation("com.google.code.gson:gson:2.8.5")

	runtime("org.postgresql:postgresql:42.2.6")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter:$jupiterVersion")
	testImplementation("org.assertj:assertj-core:$assertjVarsion")

	testRuntime("com.h2database:h2")
}

noArg {
	annotation("javax.persistence.Entity")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
