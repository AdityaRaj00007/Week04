package com.tit.annotationsandreflection.annotation.advancedlevel.jsonfield;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}
