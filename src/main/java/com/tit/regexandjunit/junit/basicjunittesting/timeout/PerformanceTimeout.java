package com.tit.regexandjunit.junit.basicjunittesting.timeout;
public class PerformanceTimeout {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Simulates a long-running task (3 seconds)
        return "Task Completed";
    }
}
