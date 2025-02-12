package com.tit.collections.listinterface;
import java.util.ArrayList;
import java.util.List;
public class RotateList {

    // Method to rotate elements in a list by a given number of positions
    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        if (size == 0 || positions <= 0) return;

        positions %= size;  // Handle cases where positions > size

        List<T> rotatedList = new ArrayList<>(size);

        // Add elements in rotated order using modulo operation
        for (int i = 0; i < size; i++) {
            rotatedList.add(list.get((i + positions) % size));
        }

        // Update the original list with the rotated elements
        list.clear();
        list.addAll(rotatedList);
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
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int rotateBy = 2;
        System.out.println("Original List:");
        displayList("Before Rotation", list);

        rotateList(list, rotateBy);
        displayList("After Rotation", list);
    }
}
