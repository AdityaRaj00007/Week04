package com.tit.annotationsandreflection.annotation.advancedlevel.jsonfield;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Aditya", 22);
        System.out.println(user.toJson());
    }
}
