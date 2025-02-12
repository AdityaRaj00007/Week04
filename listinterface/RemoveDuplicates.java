package com.tit.collections.listinterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    // Method to remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // Display method for formatted output
    public static <T> void displayList(String message, List<T> list) {
        System.out.println(message);
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test List
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List:");
        displayList("Before Removing Duplicates", list);

        List<Integer> resultList = removeDuplicates(list);
        displayList("After Removing Duplicates", resultList);
    }
}
