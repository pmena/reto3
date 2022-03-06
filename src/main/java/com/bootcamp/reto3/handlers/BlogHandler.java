package com.bootcamp.reto3.handlers;

import com.bootcamp.reto3.entities.Blog;
import com.bootcamp.reto3.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


@Component
public class BlogHandler {

    @Autowired
    private BlogService blogservice;

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ok().contentType(APPLICATION_JSON)
                .body(blogservice.findAll(), Blog.class);
    }
}
