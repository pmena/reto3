package com.bootcamp.reto3.services.impl;

import com.bootcamp.reto3.entities.Blog;
import com.bootcamp.reto3.services.BlogService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BlogServiceImpl implements BlogService {

    @Override
    public Mono<Blog> findById(String id) {
        return null;
    }

    @Override
    public Flux<Blog> findAll() {
        return null;
    }

    @Override
    public Mono<Blog> save(Blog blog) {
        return null;
    }

    @Override
    public Mono<Void> delete(String id) {
        return null;
    }
}
