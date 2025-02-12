package com.tit.collections.mapinterface;
import java.util.*;
public class MaxValueKeyFinder {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        String maxKey = getMaxKey(map);
        System.out.println("Key with the highest value: " + maxKey);
    }

    public static String getMaxKey(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null;
        }
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        // Iterate through each entry in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
