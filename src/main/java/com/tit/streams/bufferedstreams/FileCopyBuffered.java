package com.tit.streams.bufferedstreams;

import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        String sourceFile = "Source.txt";
        String destinationFile = "destination.txt";

        long startTime, endTime;

        // Using Buffered Streams
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[4096]; //4kb
            int bytesRead;
            startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();
            System.out.println("Buffered Streams Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Using Unbuffered Streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            startTime = System.nanoTime();

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            endTime = System.nanoTime();
            System.out.println("Unbuffered Streams Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

