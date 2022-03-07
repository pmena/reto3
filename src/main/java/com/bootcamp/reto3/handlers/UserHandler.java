package com.bootcamp.reto3.handlers;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class UserHandler {

    @Autowired
    private UserService userservice;

    public Mono<ServerResponse> authenticate(ServerRequest request){
        var login = request.queryParam("login").get();
        var password = request.queryParam("password").get();

        //return ServerResponse.ok().contentType(APPLICATION_JSON)
        //        .body(userservice.authenticate(login, password), User.class);

        //return this.userservice.authenticate(login, password)
        //        .flatMap(a-> ServerResponse.ok().body(Mono.just(a), User.class))
        //        .switchIfEmpty(ServerResponse.notFound().build());


        return request.bodyToMono(User.class)
                .flatMap(blog -> this.userservice.authenticate(login, password))
                .flatMap(blog -> ServerResponse.ok().body(Mono.just(blog), User.class));

        /*
        return this.userservice.authenticate(login, password).then(ServerResponse.ok().build());
         */

        /*
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(userservice.authenticate(login, password), User.class);
        */
    }


    public Mono<ServerResponse> add(ServerRequest request) {
        var id = "";
        var login = request.queryParam("login").get();
        var password = request.queryParam("password").get();
        var authorId = Integer.parseInt( request.queryParam("authorId").get());

        return this.userservice.add(new User(id,login, password,authorId)).then(ok().build());
    }

}
