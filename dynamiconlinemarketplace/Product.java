package com.tit.javagenerics.dynamiconlinemarketplace;
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getCategory();

    public void displayDetails() {
        System.out.println("Product: " + name + "\nCategory: " + getCategory() + "\nPrice: " + price);
        System.out.println("__________________________________________________");
    }
}
