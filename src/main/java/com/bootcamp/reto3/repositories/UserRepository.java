package com.bootcamp.reto3.repositories;

import com.bootcamp.reto3.entities.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends
        ReactiveMongoRepository<User, String> {

    @Query("SELECT s FROM User s WHERE LOWER(s.login) = LOWER(':login') AND s.password = ':password'")
    Mono<User> authenticate(String login, String password);


}
