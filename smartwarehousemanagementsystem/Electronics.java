package com.tit.javagenerics.smartwarehousemanagementsystem;

public class Electronics extends WareHouseItem {
     private String brand;
     public Electronics(String name , String brand){
         super(name);
         this.brand = brand;
     }
    @Override
    void display() {
        System.out.println("Electronics item: " + getName() + "\nBrand: " + brand);
        System.out.println("______________________________________________");
    }
}
