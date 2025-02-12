package com.tit.collections.queueinterface;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    private String name;
    private int severity; // Higher severity means higher priority

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    // Define sorting order (higher severity first)
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Descending order
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Adding patients
        triageQueue.add(new Patient("Aditya", 3));
        triageQueue.add(new Patient("Ankit", 5));
        triageQueue.add(new Patient("Aadarsh", 2));

        // Processing patients based on severity
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.getName()); // Print only the name
        }
    }
}
