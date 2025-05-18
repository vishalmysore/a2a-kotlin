package com.example.server
import io.github.vishalmysore.a2a.domain.JsonRpcRequest
import io.github.vishalmysore.a2a.server.JsonRpcController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.slf4j.LoggerFactory

@RestController
@RequestMapping("/")
class RoutePlanner : JsonRpcController() {
    private val logger = LoggerFactory.getLogger(RoutePlanner::class.java)

    @PostMapping
    override fun handleRpc(@RequestBody request: JsonRpcRequest): Any {
        logger.info(request.toString())
        return super.handleRpc(request)
    }
}