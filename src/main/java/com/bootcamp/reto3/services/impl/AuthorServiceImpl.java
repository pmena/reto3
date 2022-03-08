package com.bootcamp.reto3.services.impl;

import com.bootcamp.reto3.entities.Author;
import com.bootcamp.reto3.repositories.AuthorRepository;
import com.bootcamp.reto3.repositories.UserRepository;
import com.bootcamp.reto3.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Mono<Author> insert(String id) {
        //this.authorRepository.findby()


        return null;
    }

    @Override
    public Mono<Author> findById(String id) {
        return null;
    }

    @Override
    public Mono<Boolean> existsByEmail(String email) {
        return null;
    }

    @Override
    public Flux<Author> findByEmail(String email) {
        return null;
    }

    @Override
    public Flux<Author> findByName(String name) {
        return null;
    }

    @Override
    public Flux<Author> findAll() {
        return null;
    }

    @Override
    public Mono<Author> save(Author author) {
        return null;
    }

    @Override
    public Mono<Author> saveWithValidation(Author author) {
        return null;
    }

    @Override
    public Mono<Void> delete(String id) {
        return null;
    }
}
