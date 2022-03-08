package com.bootcamp.reto3.services.impl;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.repositories.UserRepository;
import com.bootcamp.reto3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> authenticate(String login, String password) {
        return this.userRepository.findAll().filter(user -> {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
            return false;
        }).last();
    }

    @Override
    public Mono<User> add(User user) {

        // Un autor debe tener un solo usuario
        return this.userRepository
                        .findByLogin(user.getLogin())
                        .filter(usuario -> {
                            if(usuario.getAuthorId() != 0) {
                                return false;
                            }
                            this.userRepository.insert(user);
                            return true;
                        });
    }
}
