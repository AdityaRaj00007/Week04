package com.tit.annotationsandreflection.reflection.basiclevel.accessprivatefield;
import java.lang.reflect.Field;

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person(25);

            // Get the Class object
            Class<?> personClass = person.getClass();
            // Get the private field 'age'
            Field ageField = personClass.getDeclaredField("age");
            // Make the private field accessible
            ageField.setAccessible(true);
            // print the current value of 'age'
            int ageValue = (int) ageField.get(person);
            System.out.println("Original Age: " + ageValue);
            // Modify the private field 'age'
            ageField.set(person, 30);
            // Retrieve and print the modified value
            System.out.println("Modified Age: " + ageField.get(person));
            // Call display method to verify change
            person.displayAge();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
