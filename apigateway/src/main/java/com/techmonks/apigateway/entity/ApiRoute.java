package com.techmonks.apigateway.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("apiRoutes")
public class ApiRoute {
    @Id
    private String id;
    private String routeIdentifier;
    private String uri;
    private String method;
    private String path;
}
