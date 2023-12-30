package com.techmonks.apigateway.service.impl;

import com.techmonks.apigateway.entity.ApiRoute;
import com.techmonks.apigateway.repository.RouteRepository;
import com.techmonks.apigateway.service.RouteService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;

    public RouteServiceImpl(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    public Flux<ApiRoute> getAll() {
        return this.routeRepository.findAll();
    }

    @Override
    public Mono<ApiRoute> create(ApiRoute apiRoute) {
        Mono<ApiRoute> route = this.routeRepository.save(apiRoute);
        return route;
    }

    @Override
    public Mono<ApiRoute> getById(String id) {
        return this.routeRepository.findById(id);
    }
}
