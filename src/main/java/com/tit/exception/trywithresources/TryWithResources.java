package com.tit.exception.trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {
    public static void main(String[] args) {
        String fileName = "info.txt";

        // Try-with-resources ensures automatic closing of BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            if ((line = reader.readLine())!= null) {
                System.out.println("line: " + line);
            } else {
                System.out.println("File is empty ");
            }

        } catch (IOException e) { // Handle file not found or read error
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
