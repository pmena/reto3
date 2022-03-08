package com.bootcamp.reto3.handlers;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.services.AuthorService;
import com.bootcamp.reto3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class AuthorHandler {

    @Autowired
    private AuthorService authorservice;

    public Mono<ServerResponse> authenticate(ServerRequest request){
        var id = request.queryParam("id").get();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(this.authorservice.insert(id), User.class);

    }
}
