package com.tit.annotationsandreflection.reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class DIContainer {
    public static <T> T createInstance(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        T instance = constructor.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = createInstance(field.getType());
                field.set(instance, dependency);
            }
        }

        return instance;
    }
}