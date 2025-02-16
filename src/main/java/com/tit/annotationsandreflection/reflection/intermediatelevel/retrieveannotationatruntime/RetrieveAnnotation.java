package com.tit.annotationsandreflection.reflection.intermediatelevel.retrieveannotationatruntime;
import java.lang.annotation.Annotation;
public class RetrieveAnnotation {
    public static void main(String[] args) {
        // Get the Class object of Book
        Class<?> bookClass = Book.class;
        // Check if @Author annotation is present
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Retrieve the annotation
            Author author = bookClass.getAnnotation(Author.class);
            // Display annotation value
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}
