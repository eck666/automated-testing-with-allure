package com.Tests.SingleTest;

import com.Base.BasePOJO;
import com.Models.Posts;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Log;
import utils.Terminal;
import utils.TestListener;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Listeners(TestListener.class)
public class PostTests extends BasePOJO {

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
        System.out.println("test2");
        assertTrue(true);
    }
}
