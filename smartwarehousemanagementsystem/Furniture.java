package com.tit.javagenerics.smartwarehousemanagementsystem;

public class Furniture extends WareHouseItem {
    private String material;
    public Furniture(String name , String material) {
        super(name);
        this.material = material;
    }

    @Override
    void display() {
        System.out.println("Furniture item: " + getName() + "\nMaterial: " + material);
    }
}
