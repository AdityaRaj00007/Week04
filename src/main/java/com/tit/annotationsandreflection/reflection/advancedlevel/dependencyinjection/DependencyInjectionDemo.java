package com.tit.annotationsandreflection.reflection.advancedlevel.dependencyinjection;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        try {
            Client client = DIContainer.createInstance(Client.class);
            client.doWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
