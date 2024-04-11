package com.Base;

import com.Models.Posts;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.get;

public class ServiceBase {
    //todo get set olmalı

    protected static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    public static List<Posts> getPosts() {
        Response responsePost = get("/posts");
        return responsePost.jsonPath().getList(".", Posts.class);
    }
    protected static Response get(String endpoint) {
        return RestAssured.given()
                .when()
                .get(BASE_URI + endpoint);
    }

}
