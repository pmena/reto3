package com.bootcamp.reto3.services.impl;

import com.bootcamp.reto3.entities.Post;
import com.bootcamp.reto3.services.PostService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public Mono<Post> save(Post post) {
        return null;
    }

    @Override
    public Flux<Post> findAll() {
        return null;
    }
}
