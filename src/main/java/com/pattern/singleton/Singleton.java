package com.pattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    public Singleton clone() {
        try {
            Singleton clone = (Singleton) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Other methods and fields...
}
