package com.tit.annotationsandreflection.annotation.advancedlevel.cacheresult;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpensiveService service = new ExpensiveService();
        System.out.println("Result: " + service.computeSquare(7));
        System.out.println("Result: " + service.computeSquare(5));
        System.out.println("Result: " + service.computeSquare(8));
        System.out.println("Result: " + service.computeSquare(3));
    }
}
