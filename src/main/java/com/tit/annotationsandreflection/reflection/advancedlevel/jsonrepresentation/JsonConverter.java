package com.tit.annotationsandreflection.reflection.advancedlevel.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                jsonBuilder.append("\"").append(fields[i].getName()).append("\": \"").append(fields[i].get(obj)).append("\"");
                if (i < fields.length - 1) {
                    jsonBuilder.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
