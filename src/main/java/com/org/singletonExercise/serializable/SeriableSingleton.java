package com.org.singletonExercise.serializable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    private static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton (){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
