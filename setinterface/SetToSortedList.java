package com.tit.collections.setinterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class SetToSortedList {

    // Method to convert a Set to a sorted List
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);  // Sort the list in ascending order
        return sortedList;
    }

    public static void main(String[] args) {
        // Test Set
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        // Display Result
        System.out.println("Sorted List: " + convertToSortedList(set));
    }
}
