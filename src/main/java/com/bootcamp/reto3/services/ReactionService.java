package com.bootcamp.reto3.services;

import com.bootcamp.reto3.entities.Reaction;
import reactor.core.publisher.Mono;

public interface ReactionService {
    Mono<Reaction> save(Reaction post);
}
