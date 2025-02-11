package com.tit.javagenerics.dynamiconlinemarketplace;
public class Gadget extends Product {
    private String brand;

    public Gadget(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getCategory() {
        return "Gadget";
    }

    public String getBrand() {
        return brand;
    }
}
