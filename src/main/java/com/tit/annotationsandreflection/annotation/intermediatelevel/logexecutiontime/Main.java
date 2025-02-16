package com.tit.annotationsandreflection.annotation.intermediatelevel.logexecutiontime;

import java.lang.reflect.Method;
// Main Method
public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(taskManager);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                System.out.println("Execution time for " + method.getName() + ": " + duration + " ms");
            }
        }
    }
}