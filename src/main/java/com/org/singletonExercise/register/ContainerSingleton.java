package com.org.singletonExercise.register;

import java.util.HashMap;

public class ContainerSingleton {

    private ContainerSingleton (){}

    private static HashMap<String,Object> ioc = new HashMap<String, Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if (!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return obj;

            }else {
                return ioc.get(className);
            }
        }
    }
}
