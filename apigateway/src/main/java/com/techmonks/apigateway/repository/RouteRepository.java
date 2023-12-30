package com.techmonks.apigateway.repository;

import com.techmonks.apigateway.entity.ApiRoute;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends ReactiveCrudRepository<ApiRoute, String> {
}
