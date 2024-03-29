/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    java
    `maven-publish`
    id("org.springframework.boot") version "2.7.4"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:3.1.3")
    implementation ("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.0")
}

group = "io.asyph"
version = "0.0.1-SNAPSHOT"
description = "AsyphDiscoveryServer"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
