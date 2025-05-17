package com.example
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.reflections.scanners.TypeAnnotationsScanner
import com.t4a.annotations.Agent
import com.t4a.annotations.ActivateLoader
fun main() {
    println(WeatherAgent::class.java.name)
    scanForAnnotatedClasses()
}
fun scanForAnnotatedClasses() {
    val reflections = Reflections("",  // Update package name
        SubTypesScanner(),
        TypeAnnotationsScanner()
    )

    val agentClasses = reflections.getTypesAnnotatedWith(Agent::class.java)
    val loaderClasses = reflections.getTypesAnnotatedWith(ActivateLoader::class.java)

    // Process found classes
    agentClasses.forEach { clazz ->
        println("Found Agent class: ${clazz.name}")
    }

    loaderClasses.forEach { clazz ->
        println("Found Loader class: ${clazz.name}")
    }
}