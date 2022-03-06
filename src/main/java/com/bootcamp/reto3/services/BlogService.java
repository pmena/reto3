package com.bootcamp.reto3.services;

import com.bootcamp.reto3.entities.Blog;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BlogService {
    Mono<Blog> findById(String id);
    Flux<Blog> findAll();
    Mono<Blog> save(Blog blog);
    Mono<Void> delete(String id);
}
