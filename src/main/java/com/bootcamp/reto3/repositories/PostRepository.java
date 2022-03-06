package com.bootcamp.reto3.repositories;

import com.bootcamp.reto3.entities.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends
        ReactiveMongoRepository<Post, String> {
}
