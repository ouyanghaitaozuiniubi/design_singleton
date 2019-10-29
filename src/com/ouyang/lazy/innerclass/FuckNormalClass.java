package com.ouyang.lazy.innerclass;

import java.lang.reflect.Constructor;

public class FuckNormalClass {
    public static void main(String[] args) {
        Class<InnerSingleton> clazz = InnerSingleton.class;

        try{
            System.out.println(InnerSingleton.getInstance());
            Constructor<InnerSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            InnerSingleton instance = constructor.newInstance();
            System.out.println(instance);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
