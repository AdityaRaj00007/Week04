package com.tit.collections.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    // Method to count frequency of Elements
    public static Map<String,Integer> frequencyCount(ArrayList<String> list){
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String element : list){
            frequencyMap.put(element,frequencyMap.getOrDefault(element,0)+1);
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        System.out.println("Frequency of elements: " + frequencyCount(list));
    }
}
