package com.tit.annotationsandreflection.reflection.basiclevel.dynamicallycreateojects;
import java.lang.reflect.Constructor;

class Student {
    String name;
    int rollNo;
    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    // Display method
    public void display() {
        System.out.println("Name: " + name + "\nRollNo: " + rollNo);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Load the Student class dynamically
            Class<?> studentClass = Class.forName("com.tit.annotationsandreflection.reflection.basiclevel.dynamicallycreateojects.Student");
            // Get the constructor with parameters (String, int)
            Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class, int.class);
            // Create an instance of Student dynamically
            Object studentObj = constructor.newInstance("Aditya", 7);
            // Cast to Student and invoke the display method
            Student student = (Student) studentObj;
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
