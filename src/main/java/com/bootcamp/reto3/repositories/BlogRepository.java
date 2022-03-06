package com.bootcamp.reto3.repositories;

import com.bootcamp.reto3.entities.Blog;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository
extends ReactiveMongoRepository<Blog, String> {

}
