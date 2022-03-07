package com.bootcamp.reto3.routes;

import com.bootcamp.reto3.handlers.BlogHandler;
import com.bootcamp.reto3.handlers.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> blogRoutes(BlogHandler blogHandler){
        return RouterFunctions.nest(RequestPredicates.path("/blog"),
                RouterFunctions
                        .route(GET(""), blogHandler::findAll));
    }

    @Bean
    public RouterFunction<ServerResponse> userRoutes(UserHandler userHandler){
        return RouterFunctions.nest(RequestPredicates.path("/user"),
                RouterFunctions
                        .route(POST("/authenticate"), userHandler::authenticate)
                        .andRoute(POST("/add"),userHandler::add)
        );
    }

    @Bean
    public RouterFunction<ServerResponse> authorRoutes(UserHandler userHandler){
        return RouterFunctions.nest(RequestPredicates.path("/author"),
                RouterFunctions
                        .route(POST("/authenticate"), userHandler::authenticate));
    }

}
