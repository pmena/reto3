package com.bootcamp.reto3.handlers;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    @Autowired
    private UserService userservice;

    public Mono<ServerResponse> authenticate(ServerRequest request){
        var login = request.queryParam("login").get();
        var password = request.queryParam("password").get();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .body(this.userservice.authenticate(login, password), User.class);

    }


    public Mono<ServerResponse> add(ServerRequest request) {
        String id = null;
        String login = request.queryParam("login").get();
        String password = request.queryParam("password").get();
        int authorId = Integer.parseInt( request.queryParam("authorId").get());

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(this.userservice.add(new User(id,login, password,authorId)), User.class);
    }

}
