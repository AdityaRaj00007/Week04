package com.tit.annotationsandreflection.reflection.advancedlevel.dependencyinjection;

public class Client {
    @Inject
    private ServiceA serviceA;

    @Inject
    private ServiceB serviceB;

    public void doWork() {
        serviceA.serve();
        serviceB.serve();
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public ServiceB getServiceB() {
        return serviceB;
    }
}
