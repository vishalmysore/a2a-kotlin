package com.example

import com.t4a.annotations.Action
import com.t4a.annotations.Agent

@Agent(
    groupName = "GeoSpatial Route Planner Agent",
    groupDescription = "Provides advanced route planning, traffic analysis, and custom map generation services"
)
class RoutePlanner {

    @Action(description = "Calculates optimal route between two locations considering traffic conditions")
    fun planOptimalRoute(origin: String, destination: String, preferences: List<String>): String {
        // Simulated response for demonstration
        return "Optimal route from $origin to $destination calculated. " +
                "Estimated time: 45 minutes. Distance: 30 miles. " +
                "Preferences applied: ${preferences.joinToString()}"
    }

    @Action(description = "Generates custom map with points of interest")
    fun generateCustomMap(points: List<String>, radius: Double): String {
        // Simulated response for demonstration
        return "Custom map generated with ${points.size} points of interest within $radius mile radius"
    }

    @Action(description = "Shows nearby locations of specified type")
    fun findNearbyPlaces(location: String, placeType: String, radius: Double): String {
        // Simulated response for demonstration
        return "Found nearby $placeType locations around $location within $radius miles"
    }
}