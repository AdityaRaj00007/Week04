package com.tit.collections.setinterface;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    // Method to compute the symmetric difference between two sets
    public static <T> Set<T> computeSymmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);  // Combine all elements from both sets

        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);  // Find common elements

        result.removeAll(intersection);  // Remove common elements
        return result;
    }

    public static void main(String[] args) {
        // Test Sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Symmetric Difference: " + computeSymmetricDifference(set1, set2));
    }
}
