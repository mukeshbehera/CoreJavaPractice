package com.pattern.singleton;

public class SingletonUnbreakableUsingInstanceHolderClass {

    private SingletonUnbreakableUsingInstanceHolderClass(){
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    private static final class InstanceHolder {
        private static final SingletonUnbreakableUsingInstanceHolderClass instance = new SingletonUnbreakableUsingInstanceHolderClass();
    }

    public static SingletonUnbreakableUsingInstanceHolderClass getInstance(){
        return InstanceHolder.instance;
    }
}
