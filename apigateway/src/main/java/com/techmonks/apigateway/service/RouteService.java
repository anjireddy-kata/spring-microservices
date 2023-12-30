package com.techmonks.apigateway.service;

import com.techmonks.apigateway.entity.ApiRoute;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RouteService {
    Flux<ApiRoute> getAll();

    Mono<ApiRoute> create(ApiRoute apiRoute);

    Mono<ApiRoute> getById(String id);
}
