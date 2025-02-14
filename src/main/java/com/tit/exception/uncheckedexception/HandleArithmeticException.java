package com.tit.exception.uncheckedexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed " + e);
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values " + e);
        } finally {
            input.close();
            System.out.println("Execution completed ");
        }
    }
}
