package com.tit.annotationsandreflection.annotation.advancedlevel.roleallowed;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        SecureService service = new SecureService();
        String currentUserRole = "USER";

        Method method = SecureService.class.getMethod("adminTask");
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (roleAllowed.value().equals(currentUserRole)) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        } else {
            method.invoke(service);
        }
    }
}
