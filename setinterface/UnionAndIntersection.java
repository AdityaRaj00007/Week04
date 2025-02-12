package com.tit.collections.setinterface;

import java.util.*;

public class UnionAndIntersection {
    public static <T> Set<T> findUnion(Set<T> set1 , Set<T> set2){
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2); // add all elements
        return unionSet;
    }

    public static <T> Set<T> findIntersection(Set<T> set1 , Set<T> set2){
        Set<T> intersectionList = new HashSet<>(set1);
        intersectionList.retainAll(set2); // remove all elements present in set1
        return intersectionList;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        // Display Results
        System.out.println("Union: " + findUnion(set1, set2));
        System.out.println("Intersection: " + findIntersection(set1, set2));
    }
}
