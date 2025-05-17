plugins {
    kotlin("jvm") version "2.1.0"
    kotlin("plugin.spring") version "2.1.0"
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.github.vishalmysore:a2ajava:0.0.7.9"){

            exclude(group = "io.swagger.core.v3", module = "swagger-core")
            exclude(group = "io.swagger.core.v3", module = "swagger-core-jakarta")
            exclude(group = "io.swagger.parser.v3", module = "swagger-parser")

    }
    implementation("org.springframework.boot:spring-boot-starter:3.4.5")
    implementation("org.apache.httpcomponents.client5:httpclient5") // no version
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.swagger.core.v3:swagger-models:2.2.19")
    implementation("io.swagger.core.v3:swagger-core:2.2.19")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        javaParameters = true
    }
}
kotlin {
    jvmToolchain(23)
}