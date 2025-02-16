package com.tit.annotationsandreflection.reflection.advancedlevel.methodexecutiontiming;

import java.lang.reflect.Proxy;

public  class MethodExecutionTimingDemo {
    public static void main(String[] args) {
        Task task = new TaskImpl();

        Task proxyInstance = (Task) Proxy.newProxyInstance(
                task.getClass().getClassLoader(),
                task.getClass().getInterfaces(),
                new TimingInvocationHandler(task)
        );

        proxyInstance.performTask();
    }
}
