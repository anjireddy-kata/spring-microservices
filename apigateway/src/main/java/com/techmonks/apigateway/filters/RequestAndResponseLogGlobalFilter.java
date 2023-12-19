package com.techmonks.apigateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Component
public class RequestAndResponseLogGlobalFilter implements GlobalFilter, Ordered {
    private static final Logger logger = LogManager.getLogger(RequestAndResponseLogGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Pre Filter Logic: Request path: {}", exchange.getRequest().getPath().toString());
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            logger.info("Post Filter Logic: HTTP Status Code: {}", exchange.getResponse().getStatusCode().toString());
        }));
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
