package com.bootcamp.reto3.services;

import com.bootcamp.reto3.entities.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> authenticate(String login, String password);

}
