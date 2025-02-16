package com.tit.annotationsandreflection.reflection.advancedlevel.customlogging;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                greeting.getClass().getInterfaces(),
                new LoggingInvocationHandler(greeting)
        );

        proxyInstance.sayHello();
    }
}