package com.bootcamp.reto3.handlers;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class UserHandler {

    @Autowired
    private UserService userservice;

    public Mono<ServerResponse> authenticate(ServerRequest request){
        var login = request.queryParam("login").get();
        var password = request.queryParam("password").get();

        return ok().contentType(APPLICATION_JSON)
                .body(userservice.authenticate(login, password), User.class);
    }

}
