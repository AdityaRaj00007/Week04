package com.tit.annotationsandreflection.annotation.advancedlevel.jsonfield;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toJson() throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();
        List<String> jsonFields = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                String key = annotation.name();
                Object value = field.get(this);
                jsonFields.add("\"" + key + "\": \"" + value + "\"");
            }
        }
        jsonBuilder.append(String.join(", ", jsonFields));
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
