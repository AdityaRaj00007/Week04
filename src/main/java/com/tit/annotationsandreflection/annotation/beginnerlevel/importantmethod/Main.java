package com.tit.annotationsandreflection.annotation.beginnerlevel.importantmethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        taskManager.completeTask();
        taskManager.startTask();
        taskManager.cancelTask();

        Method[] methods = TaskManager.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + importantMethod.level());
            }
        }
    }
}