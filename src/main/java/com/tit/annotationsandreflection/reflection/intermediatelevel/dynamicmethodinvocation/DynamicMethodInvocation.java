package com.tit.annotationsandreflection.reflection.intermediatelevel.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();
            // Get the Class object
            Class<?> mathClass = mathOps.getClass();
            // Take user input for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = input.nextLine();
            // Get method dynamically
            Method method = mathClass.getMethod(methodName, int.class, int.class);
            // Take user input for parameters
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();
            // Invoke method dynamically
            Object result = method.invoke(mathOps, num1, num2);
            // Display the result
            System.out.println("Result: " + result);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
