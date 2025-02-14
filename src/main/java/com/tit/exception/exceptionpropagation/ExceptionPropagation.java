package com.tit.exception.exceptionpropagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
    static void method1() throws ArithmeticException{
        int result = 10/0;
    }
    static void method2(){
        method1();
    }
}
