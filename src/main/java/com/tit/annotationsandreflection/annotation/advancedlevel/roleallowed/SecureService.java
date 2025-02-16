package com.tit.annotationsandreflection.annotation.advancedlevel.roleallowed;

public class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}