package com.tit.annotationsandreflection.annotation.exercise.repeatableannotation;

public class TaskManager {
    @BugReport(description = "Null pointer exception when input is null")
    @BugReport(description = "Array index out of bounds when index is negative")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
