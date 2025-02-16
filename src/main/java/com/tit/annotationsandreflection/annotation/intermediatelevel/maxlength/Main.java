package com.tit.annotationsandreflection.annotation.intermediatelevel.maxlength;

public class Main {
    // Main Method
    public static void main(String[] args) {
        try {
            User user1 = new User("shortname");
            System.out.println("User created: " + user1.getUsername());

            User user2 = new User("verylongusername");
            System.out.println("User created: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
