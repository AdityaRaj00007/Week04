package com.tit.annotationsandreflection.annotation.exercise.customannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        taskManager.completeTask();

        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        if (taskInfo != null) {
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}

