package com.bootcamp.reto3.repositories;

import com.bootcamp.reto3.entities.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends
        ReactiveMongoRepository<User, String> {

    @Query(value = "{'login' : ?0 }", fields = "{'login' : ?0 , 'password' : ?1 }")
    Mono<User> authenticate(String login, String password);

    @Query(value = "{'login' : ?0 }", fields="{'login': ?0 }")
    Mono<User> findByLogin(String login);

}
