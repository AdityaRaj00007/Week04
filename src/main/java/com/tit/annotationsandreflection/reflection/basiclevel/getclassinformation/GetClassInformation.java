package com.tit.annotationsandreflection.reflection.basiclevel.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

class Student{
    String name;
    int rollNo;
    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void display(String name , int rollNo){
        System.out.println("Name: " + name + "\nRollNo: " + rollNo);
    }
}
public class GetClassInformation {
    public static void main(String[] args) {
        Student student = new Student("Aditya" , 07);
        try {
            // Load class
            Class<?> cls = Class.forName("com.tit.annotationsandreflection.reflection.basiclevel.getclassinformation.Student");

            // Display class name
            System.out.println("Class name: " +cls.getName());
            // Display Constructors
            System.out.println("Constructors: ");
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);

            System.out.println(" " + constructor);
            // Display fields
            System.out.println("Fields: ");
            Field[] fields = cls.getDeclaredFields();
            for(Field field : fields){
                System.out.println(" " + field);
            }
        } catch (Exception e) {
            System.out.println("Class not found: " + "Student");
        }
    }

}
