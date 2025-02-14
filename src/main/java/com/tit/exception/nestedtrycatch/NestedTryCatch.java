package com.tit.exception.nestedtrycatch;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i = 0;i<n;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the index of the element: ");
        int index = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        try {
            int element = array[index];
            try {
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            input.close();
            System.out.println("Operation completed.");
        }
    }
}

