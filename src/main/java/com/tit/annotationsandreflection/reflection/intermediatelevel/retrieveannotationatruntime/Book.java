package com.tit.annotationsandreflection.reflection.intermediatelevel.retrieveannotationatruntime;
@Author(name = "Aditya Raj Gupta")
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle() {
        System.out.println("Book Title: " + title);
    }
}
