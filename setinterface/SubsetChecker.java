package com.tit.collections.setinterface;
import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {

    // Method to check if set1 is a subset of set2
    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
        // Test Sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println("Is Set1 a subset of Set2? " + isSubset(set1, set2));
    }
}
