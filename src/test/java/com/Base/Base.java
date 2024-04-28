package com.Base;


import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import utils.TestAllureListener;
import static io.restassured.RestAssured.get;

@Listeners({TestAllureListener.class})
public class Base {
    //todo ortak assuretionları burda olmalı her yerde kullandıklarım burda olmalı



    public void getComments() {
        Response responseComment = get("/comment");
    }

    public void getAlbums() {
        Response responseAlbums = get("/albums");
    }


}
