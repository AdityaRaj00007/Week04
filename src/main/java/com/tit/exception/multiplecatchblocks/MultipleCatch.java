package com.tit.exception.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the index: ");
        int index = input.nextInt();

        try {
            arrayOperations(arr, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds " + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            input.close();
            System.out.println("Execution completed ");
        }
    }

    static void arrayOperations(int arr[], int index) {
        System.out.println("Element at index " + index + ": " + arr[index]);
    }
}
