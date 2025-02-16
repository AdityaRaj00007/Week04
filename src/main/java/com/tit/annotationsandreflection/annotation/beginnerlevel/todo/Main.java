package com.tit.annotationsandreflection.annotation.beginnerlevel.todo;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        taskManager.logTask();
        taskManager.optimizeTask();

        Method[] methods = TaskManager.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("TODO - Method: " + method.getName() + ", Task: " + todo.task() + ", Assigned To: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}
