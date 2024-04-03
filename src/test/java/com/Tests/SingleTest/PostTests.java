package com.Tests.SingleTest;

import com.Base.BasePOJO;
import com.Models.Posts;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class PostTests extends BasePOJO {

    @Test
    @Description("Verify if userId is 7 and title is 'voluptatem laborum magni'")
    public void testUserId() {
        List<Posts> postsList = getPosts();
        boolean found = false;
        for (Posts post : postsList) {
            int userId = post.getUserId();
            String title = post.getTitle();
            System.out.println("User ID: " + userId + ", Title: " + title);
            if (userId == 7 && title.equals("voluptatem laborum magni")) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(found, "Could not find userId 7 with title 'voluptatem laborum magni'");
    }
}
