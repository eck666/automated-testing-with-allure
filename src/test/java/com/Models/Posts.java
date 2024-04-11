package com.Models;

import com.Base.Base;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Posts extends Base {
    @JsonProperty("userId")
    private long userId;

    @JsonProperty("id")
    private long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    public long getUserId() {
        return userId;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
