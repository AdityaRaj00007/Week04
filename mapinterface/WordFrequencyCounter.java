package com.tit.collections.mapinterface;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\rajgu\\OneDrive\\Desktop\\sample.txt.txt";

        try {
            Map<String, Integer> wordCountMap = countWordFrequency(fileName);
            System.out.println("Word Frequencies: " + wordCountMap);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static Map<String, Integer> countWordFrequency(String fileName) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            // Convert to lowercase and remove punctuation
            line = line.toLowerCase().replaceAll("[^a-zA-Z0-9' ]", "");
            String[] words = line.split("\\s+"); // Split by spaces

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();
        return wordCount;
    }
}
