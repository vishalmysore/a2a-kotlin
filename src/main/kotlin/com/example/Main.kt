package com.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import io.github.vishalmysore.a2a.client.LocalA2ATaskClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class A2AKotlinApp

fun main(args: Array<String>) {
    runApplication<A2AKotlinApp>(*args)
    var client = LocalA2ATaskClient()
    //this is to test how it works locally and to infuse ai in kotlin based app
    var response= client.sendTask("hows the weather in London");
    println("Response: $response")
    println("starting the server")
    //the server will start now
}
