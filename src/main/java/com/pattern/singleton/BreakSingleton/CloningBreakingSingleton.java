package com.pattern.singleton.BreakSingleton;

import com.pattern.singleton.Singleton;

public class CloningBreakingSingleton {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;

        try {
            instance2 = (Singleton) instance1.clone();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Instance1 hash code: " + instance1.hashCode());
        System.out.println("Instance2 hash code: " + instance2.hashCode());
    }
}
