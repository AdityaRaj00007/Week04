package com.tit.javagenerics.smartwarehousemanagementsystem;

public class Groceries extends WareHouseItem {
    private String expiryDate;
    public Groceries(String name , String expiryDate){
        super(name);
        this.expiryDate = expiryDate;
    }
    @Override
    void display() {
        System.out.println("Groceries item: " + getName() + "\nExpiryDate: " + expiryDate);
        System.out.println("______________________________________________");
    }
}
