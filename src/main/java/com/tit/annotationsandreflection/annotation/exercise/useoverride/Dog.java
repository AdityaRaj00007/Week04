package com.tit.annotationsandreflection.annotation.exercise.useoverride;

public class Dog extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
