package com.tit.annotationsandreflection.reflection.advancedlevel.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapperDemo {
    public static void main(String[] args) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        try {
            User user = ObjectMapper.toObject(User.class, properties);
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
