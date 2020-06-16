package com.bryan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWorld

fun main(args: Array<String>){
    runApplication<HelloWorld>(*args)
}