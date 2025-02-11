package com.tit.javagenerics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WareHouseItem>{
    List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }
    public List<T> getItems(){
        return items;
    }

    public static void displayItems(List<? extends WareHouseItem>items) {
        for(WareHouseItem item : items){
            item.display();
        }
    }
}
