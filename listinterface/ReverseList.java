package com.tit.collections.listinterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Method to reverse a List without built-in methods
    public static <T> void reverseList(List<T> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            T temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    // Display method with formatted output
    public static <T> void displayList(String listType, List<T> list) {
        System.out.println(listType + " Reversed List:");
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test with ArrayList
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        reverseList(arrayList);
        displayList("ArrayList", arrayList);

        // Test with LinkedList
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }

        reverseList(linkedList);
        displayList("LinkedList", linkedList);
    }
}
