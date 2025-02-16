package com.tit.annotationsandreflection.annotation.exercise.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        taskManager.completeTask();

        Method method = TaskManager.class.getMethod("completeTask");
        BugReports bugReports = method.getAnnotation(BugReports.class);

        if (bugReports != null) {
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug Description: " + bugReport.description());
            }
        }
    }
}

