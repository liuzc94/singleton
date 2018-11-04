package com.single.Lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyThreeTest {
    public static void main(String[] args) {
        Class<?> clazz = LazyThree.class;

        Constructor c = null;
        try {
            c = clazz.getDeclaredConstructor(null);
            //强制访问
            c.setAccessible(true);
            Object obj1= c.newInstance();
            Object obj2= c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
