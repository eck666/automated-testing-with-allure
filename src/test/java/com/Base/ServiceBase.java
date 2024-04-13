package com.Base;

import com.Models.Posts;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.get;

public class ServiceBase {
    //todo get set olmalı

    protected static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    public static List<Posts> getPosts() {
        Response response = get("/posts");
        attachResponse(response);
        return response.jsonPath().getList(".", Posts.class);
    }

    protected static Response get(String endpoint) {
        return RestAssured.given()
                .when()
                .get(BASE_URI + endpoint);
    }

    @Attachment(value = "Response", type = "application/json")
    private static byte[] attachResponse(Response response) {
        return response.getBody().asString().getBytes();
    }
}
