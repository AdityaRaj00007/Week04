package com.tit.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        queue1.add(x);
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int poppedValue = queue1.remove();

        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        return poppedValue;
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        int topValue = queue1.peek(); // Peek the last element
        queue2.add(queue1.remove()); // Move it to queue2 as well

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topValue;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Display method to print stack elements (from top to bottom)
    public void display() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack elements (top to bottom): ");
        for (int num : queue1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        // Perform stack operations
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
