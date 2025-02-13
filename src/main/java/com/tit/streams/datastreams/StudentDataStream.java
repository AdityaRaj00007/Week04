package com.tit.streams.datastreams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String filePath = "student_data.bin";

        // Writing data to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);

            System.out.println("Student data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing student data: " + e.getMessage());
        }

        // Reading data from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (true) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.err.println("Error reading student data: " + e.getMessage());
        }
    }
}

