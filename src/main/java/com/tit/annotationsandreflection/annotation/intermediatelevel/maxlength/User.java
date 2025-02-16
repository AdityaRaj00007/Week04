package com.tit.annotationsandreflection.annotation.intermediatelevel.maxlength;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds maximum length of 10 characters");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
