package com.tit.annotationsandreflection.annotation.intermediatelevel.logexecutiontime;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
