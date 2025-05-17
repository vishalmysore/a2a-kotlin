package com.example

import com.t4a.annotations.Action
import com.t4a.annotations.Agent

@Agent(groupName = "Weather Service", groupDescription = "Provides current weather info")
open class WeatherAgent {

    @Action(description = "Get temperature for a given city")
    fun getTemperature(city: String): String {
        return "The current temperature in $city is 25°C"
    }
}

// ✅ Top-level main function
fun main() {
    val agent = WeatherAgent()
    println(agent.getTemperature("Toronto"))
}
