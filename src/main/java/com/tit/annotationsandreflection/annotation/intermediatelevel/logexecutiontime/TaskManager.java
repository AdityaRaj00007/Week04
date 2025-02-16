package com.tit.annotationsandreflection.annotation.intermediatelevel.logexecutiontime;

class TaskManager {
    @LogExecutionTime
    public void taskOne() {
        System.out.println("Executing Task One");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @LogExecutionTime
    public void taskTwo() {
        System.out.println("Executing Task Two");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
