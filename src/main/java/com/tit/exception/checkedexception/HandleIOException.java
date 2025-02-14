package com.tit.exception.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HandleIOException {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\rajgu\\OneDrive\\Desktop\\Week04\\Day04_Exception-Handling\\src\\main\\resources\\data.txt";
        try{
            // this can throw Io Exception if this not found
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e);
        }
        finally {
            System.out.println("Execution completed ");
        }
    }
}
