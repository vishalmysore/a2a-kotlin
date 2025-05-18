# A2A Agent in Kotlin using a2ajava

This project demonstrates the implementation of an Agent-to-Agent (A2A) protocol using Kotlin and the a2ajava library. The A2A protocol enables communication and task delegation between software agents, making it easier to build distributed AI-powered applications.

## What is the A2A Protocol?

The Agent-to-Agent (A2A) protocol is a standardized way for software agents to communicate and delegate tasks to each other. Key features include:

- **Standardized Communication**: Agents can communicate using a common protocol regardless of their implementation
- **Task Delegation**: Agents can delegate tasks to other agents based on their capabilities
- **Asynchronous Operation**: Support for both synchronous and asynchronous task execution
- **Extensible Architecture**: Easy to add new agents and capabilities to the system

## Project Structure

This project includes:

- `WeatherAgent`: A sample agent that provides weather information
- `RoutePlanner`: A sample agent that provides route planning services
- Spring Boot integration for running the agent service
- Local and remote client support for agent communication

## Implementation Details

 You can start the server with main.kt and then connect your client using the 
url `localhost:8080`   , the agent card will be avaiable at `http://localhost:8080/.well-known/agent.json`

### Weather Agent Implementation

```kotlin
@Agent(groupName = "Weather Service", groupDescription = "Provides current weather info")
open class WeatherAgent {
    @Action(description = "Get temperature for a given city")
    fun getTemperature(city: String): String {
        return "The current temperature in $city is 25°C"
    }
}
```

### Client Usage Example

```kotlin
@SpringBootApplication
class A2AKotlinApp

fun main(args: Array<String>) {
    runApplication<A2AKotlinApp>(*args)
    var client = LocalA2ATaskClient()
    var response = client.sendTask("hows the weather in London")
    println("Response: $response")
}
```

## Client Types

The project supports two types of clients:

1. **Local Client**: Used for testing and development, runs agents in the same JVM
   ```kotlin
   var client = LocalA2ATaskClient()
   ```

2. **Remote Client**: Connects to remote agent servers
   ```kotlin
   var client = RemoteA2ATaskClient("http://server-url")
   ```

## Getting Started

1. Clone the repository
2. Build using Gradle:
   ```bash
   ./gradlew build
   ```
3. Run the application:
   ```bash
   ./gradlew bootRun
   ```

## Dependencies

- Spring Boot 3.2.5
- a2ajava 0.0.7.9
- Kotlin 2.1.0
- JDK 23

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.