package com.tit.annotationsandreflection.annotation.beginnerlevel.importantmethod;

public class TaskManager {
    @ImportantMethod(level = "HIGH")
    public void completeTask() {
        System.out.println("Task completed");
    }

    @ImportantMethod(level = "MEDIUM")
    public void startTask() {
        System.out.println("Task started");
    }

    public void cancelTask() {
        System.out.println("Task canceled");
    }
}
