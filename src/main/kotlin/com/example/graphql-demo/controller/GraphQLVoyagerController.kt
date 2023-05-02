package com.example.graphql.controller

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@ConditionalOnProperty(
    value = ["spring.graphql.voyager.enabled"],
    havingValue = "true",
    matchIfMissing = true,
)
@RequestMapping("/graphql-voyager")
@Controller
class GraphQLVoyagerController {

    @GetMapping
    fun voyager(): String {
        return "graphql-voyager"
    }
}
