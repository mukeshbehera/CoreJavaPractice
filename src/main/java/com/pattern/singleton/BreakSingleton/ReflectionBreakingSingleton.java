package com.pattern.singleton.BreakSingleton;

import com.pattern.singleton.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreakingSingleton {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;

        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Instance1 hash code: " + instance1.hashCode());
        System.out.println("Instance2 hash code: " + instance2.hashCode());
    }
}
