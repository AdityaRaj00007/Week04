package com.tit.javagenerics.dynamiconlinemarketplace;
public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getCategory() {
        return "Book";
    }

    public String getAuthor() {
        return author;
    }
}
