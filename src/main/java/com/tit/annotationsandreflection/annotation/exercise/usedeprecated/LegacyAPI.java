package com.tit.annotationsandreflection.annotation.exercise.usedeprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is an old feature.");
    }

    public void newFeature() {
        System.out.println("This is a new feature.");
    }
}
