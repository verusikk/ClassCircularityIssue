import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm").version("1.9.23")
    id("io.qameta.allure").version("2.11.2")
}

group = "com.azul.external"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.11.0-M2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0-M2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
