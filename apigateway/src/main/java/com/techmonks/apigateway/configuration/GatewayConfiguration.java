package com.techmonks.apigateway.configuration;

import com.techmonks.apigateway.filters.RequestAndResponseLogGlobalFilter;
import com.techmonks.apigateway.service.RouteService;
import com.techmonks.apigateway.service.impl.ApiRouteLocatorImpl;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
    private RequestAndResponseLogGlobalFilter requestAndResponseLogGlobalFilter;

//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder.routes().route("order-service",
//                        route -> route.path("/orders/**")
//                                .filters(filter -> {
//                                    filter.addResponseHeader("res-header", "res-header-value");
//                                    return filter;
//                                })
//                                .uri("http://localhost:8081"))
//                .build();
//    }

    @Bean
    public RouteLocator routeLocator(RouteService routeService, RouteLocatorBuilder routeLocationBuilder) {
        return new ApiRouteLocatorImpl(routeLocationBuilder, routeService);
    }
}
