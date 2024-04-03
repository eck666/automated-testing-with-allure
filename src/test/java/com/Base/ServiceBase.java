package com.Base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ServiceBase {

    protected static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    protected static Response get(String endpoint) {
        return RestAssured.given()
                .when()
                .get(BASE_URI + endpoint);
    }
}
