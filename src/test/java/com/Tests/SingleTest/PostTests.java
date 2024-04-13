package com.Tests.SingleTest;

import com.Base.Base;
import com.Models.Posts;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log;

import java.util.List;

import static com.Base.ServiceBase.getPosts;
import static org.testng.Assert.assertTrue;


public class PostTests extends Base {

    @Test
    @Description("Verify if userId is 7 and title is 'voluptatem laborum magni'")
    public void testUserId() {
        List<Posts> postsList = getPosts();
        boolean found = false;
        for (Posts post : postsList) {
            long userId = post.getUserId();
            String title = post.getTitle();
            if (userId == 7 && title.equals("voluptatem laborum magni")) {
                Log.warning("emocanek");
                found = true;
                break;
            }
        }
        System.out.println("test1");
        Assert.assertTrue(found, "Could not find userId 7 with title 'voluptatem laborum magni'");
    }

    @Test
    public void testSample() {
        List<Posts> postsList = getPosts();
        boolean found = false;
        for (Posts post : postsList) {
            long userId = post.getUserId();
            String title = post.getTitle();
            if (userId == 7 && title.equals("voluptatem laborum magni")) {
                Log.warning("emocanek");
                found = true;
                break;
            }
        }
        System.out.println("test1");
        Assert.assertTrue(found, "Could not find userId 7 with title 'voluptatem laborum magni'");
    }

    @Test
    public void testSample2() {
        List<Posts> postsList = getPosts();
        boolean found = false;
        for (Posts post : postsList) {
            long userId = post.getUserId();
            String title = post.getTitle();
            if (userId == 7 && title.equals("voluptatem laborum magni")) {
                Log.warning("emocanek");
                found = true;
                break;
            }
        }
        System.out.println("test1");
        Assert.assertTrue(found, "Could not find userId 7 with title 'voluptatem laborum magni'");
    }
}
