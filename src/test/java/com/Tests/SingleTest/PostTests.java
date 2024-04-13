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

    public static final String EXPECTED = "expected";
    public static final String ACTUAL = "actual";

    @Test
    @Description("Verify if userId is 7 and title is 'voluptatem laborum magni'")
    public void testUserId() {
        List<Posts> postsList = getPosts();
        boolean found = false;
        for (Posts post : postsList) {
            long userId = post.getUserId();
            String title = post.getTitle();
            if (userId == 7 && title.equals("voluptatem laborum magni")) {
                System.out.println("Title " + title);
                found = true;
                break;
            }
        }
        if (!found) {
            Log.fail("Could not find userId 7 with title 'voluptatem laborum magni'");
        }
    }



    @Test
    public void testUserIdLong() {
        List<Posts> postsList = getPosts();
        for (Posts posts: postsList) {
            long userId = posts.getUserId();
            if ( userId<= 101) {
                Log.pass("User ID length <= 101");
            } else {
                Log.fail("User ID lenght >= 101");
            }
        }
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
        Assert.assertTrue(found, "Could not find userId 7 with title 'voluptatem laborum magni'");
    }
}
