package com.tit.annotationsandreflection.reflection.intermediatelevel.retrieveannotationatruntime;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define @Author annotation
@Retention(RetentionPolicy.RUNTIME)  // Retain annotation at runtime
@Target(ElementType.TYPE)            // Applicable to classes only
@interface Author {
    String name();
}
