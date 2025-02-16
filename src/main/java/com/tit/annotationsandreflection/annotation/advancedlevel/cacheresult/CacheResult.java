package com.tit.annotationsandreflection.annotation.advancedlevel.cacheresult;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}