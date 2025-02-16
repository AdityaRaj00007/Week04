package com.tit.annotationsandreflection.annotation.intermediatelevel.maxlength;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}
