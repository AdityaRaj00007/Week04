package com.tit.annotationsandreflection.reflection.intermediatelevel.accessandmodifystaticfields;
import java.lang.reflect.Field;
public class Configuration {
    // Private static field
    private static String API_KEY = "ORIGINAL_KEY";

    // Method to get API_KEY value
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }

    public static void main(String[] args) {
        try {
            // Get the Class object for Configuration
            Class<?> configClass = Configuration.class;
            // Get the private static field 'API_KEY'
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            // Make the field accessible
            apiKeyField.setAccessible(true);
            // Modify the static field value
            apiKeyField.set(null, "NEW_SECRET_KEY");
            // Verify the updated value
            printApiKey();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
