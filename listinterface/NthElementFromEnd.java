package com.tit.collections.listinterface;
import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {

    // Method to find the Nth element from the end
    public static <T> void findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            System.out.println("Invalid input. List is empty or N is not positive.");
            return;
        }

        var firstPointer = list.listIterator();
        var secondPointer = list.listIterator();

        // Move the first pointer N steps ahead
        int count = 0;
        while (count < n && firstPointer.hasNext()) {
            firstPointer.next();
            count++;
        }

        if (count < n) {
            System.out.println("N is larger than the size of the list.");
            return;
        }

        // Move both pointers until the first reaches the end
        while (firstPointer.hasNext()) {
            firstPointer.next();
            secondPointer.next();
        }

        System.out.println("Nth Element from the End: " + secondPointer.next());
    }

    public static void main(String[] args) {
        // Test LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        int n = 2; // Find 2nd element from the end
        findNthFromEnd(linkedList, n);
    }
}
