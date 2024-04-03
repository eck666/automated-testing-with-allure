package com.Base;

import com.Models.Posts;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

public class BasePOJO extends ServiceBase {
    //todo get set methodları burda olacak ortak methdolar da burda olabilir

    public static List<Posts> getPosts() {
        Response responsePost = get("/posts");
        return responsePost.jsonPath().getList(".", Posts.class);
    }

    public void getComments() {
        Response responseComment = get("/comment");
    }

    public void getAlbums() {
        Response responseAlbums = get("/albums");
    }


}
