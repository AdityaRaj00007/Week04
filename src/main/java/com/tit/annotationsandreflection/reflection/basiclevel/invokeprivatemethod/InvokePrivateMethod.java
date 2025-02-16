package com.tit.annotationsandreflection.reflection.basiclevel.invokeprivatemethod;
import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            // Get the Class object
            Class<?> calculatorClass = calculator.getClass();
            // Get the private method 'multiply'
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);
            // Make the private method accessible
            multiplyMethod.setAccessible(true);
            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            // Display the result
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
