package com.soon83

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

fun main(args: Array<String>) {
    runApplication<KotlinCoroutinesApplication>(*args)
}
