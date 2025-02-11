package com.tit.javagenerics.smartwarehousemanagementsystem;

public abstract class WareHouseItem {
    private String name;
    public WareHouseItem(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    abstract void display();
}
