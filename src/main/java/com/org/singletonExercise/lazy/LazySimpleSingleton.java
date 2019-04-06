package com.org.singletonExercise.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }
}
