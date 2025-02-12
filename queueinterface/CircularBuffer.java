package com.tit.collections.queueinterface;
import java.util.Arrays;

public class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    // Constructor
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Insert an element (overwrites oldest when full)
    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % capacity; // Move rear circularly

        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Overwrite oldest element
        }
    }

    // Display buffer contents
    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty!");
            return;
        }

        System.out.print("Circular Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();

        cb.insert(5);
        cb.display();
    }
}
