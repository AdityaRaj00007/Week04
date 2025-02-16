package com.tit.annotationsandreflection.reflection.advancedlevel.jsonrepresentation;

public class JsonConverterDemo {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 25);
        String json = JsonConverter.toJson(student);
        System.out.println("JSON Representation: " + json);
    }
}
