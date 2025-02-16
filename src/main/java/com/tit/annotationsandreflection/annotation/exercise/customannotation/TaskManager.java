package com.tit.annotationsandreflection.annotation.exercise.customannotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
