package com.tit.annotationsandreflection.reflection.advancedlevel.methodexecutiontiming;

public class TaskImpl implements Task {
    @Override
    public void performTask() {
        try {
            Thread.sleep(1000); // Simulating some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task performed!");
    }
}
