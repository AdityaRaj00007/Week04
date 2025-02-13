package com.tit.streams.filterstreams;
import java.io.*;

public class UppercaseToLowercaseConverter {
    public static void main(String[] args) {
        String inputFilePath = "Source.txt";
        String outputFilePath = "output_text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion successful. Output saved as: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}