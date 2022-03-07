package com.bootcamp.reto3.repositories.impl;

import com.bootcamp.reto3.entities.User;
import com.bootcamp.reto3.repositories.UserRepository;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Mono<User> authenticate(String login, String password) {
        /*
        return this.findAll()
                .flatMap( a-> {
            if (a.getLogin().equals(login) && a.getPassword().equals(password)) {
                return a;
            }
            return null;
        });
         */
        return null;
    }

    @Override
    public <S extends User> Mono<S> insert(S entity) {
        return this.insert(entity);
    }

    @Override
    public <S extends User> Flux<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> insert(Publisher<S> entities) {
        return null;
    }

    @Override
    public <S extends User> Mono<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Mono<Long> count(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> Mono<Boolean> exists(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User, R, P extends Publisher<R>> P findBy(Example<S> example, Function<FluentQuery.ReactiveFluentQuery<S>, P> queryFunction) {
        return null;
    }

    @Override
    public Flux<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Mono<S> save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends User> Flux<S> saveAll(Publisher<S> entityStream) {
        return null;
    }

    @Override
    public Mono<User> findById(String s) {
        return null;
    }

    @Override
    public Mono<User> findById(Publisher<String> id) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<String> id) {
        return null;
    }

    @Override
    public Flux<User> findAll() {
        return null;
    }

    @Override
    public Flux<User> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public Flux<User> findAllById(Publisher<String> idStream) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<String> id) {
        return null;
    }

    @Override
    public Mono<Void> delete(User entity) {
        return null;
    }

    @Override
    public Mono<Void> deleteAllById(Iterable<? extends String> strings) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends User> entities) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends User> entityStream) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
