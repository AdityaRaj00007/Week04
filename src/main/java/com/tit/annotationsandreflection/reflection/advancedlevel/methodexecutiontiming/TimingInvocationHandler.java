package com.tit.annotationsandreflection.reflection.advancedlevel.methodexecutiontiming;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimingInvocationHandler implements InvocationHandler {
    private final Object target;

    public TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.nanoTime();
        Object result = method.invoke(target, args);
        long endTime = System.nanoTime();
        System.out.println("Execution time for method " + method.getName() + ": " + (endTime - startTime) + " ns");
        return result;
    }
}
