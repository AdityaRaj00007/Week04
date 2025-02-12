package com.tit.collections.queueinterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {

    public static void generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        System.out.println("First " + n + " Binary Numbers:");
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            // Add "0" and "1" to generate the next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers(N);
    }
}
