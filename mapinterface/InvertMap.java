package com.tit.collections.mapinterface;
import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);
        Map<Integer, List<String>> invertedMap = invertMap(originalMap);

        System.out.println("Original Map: " + originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> inputMap) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        // Loop through each key-value pair in the original map
        for (String key : inputMap.keySet()) {
            Integer value = inputMap.get(key);
            // If the value is not in the inverted map, add it with an empty list
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            // Add the key to the list for this value
            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }
}
