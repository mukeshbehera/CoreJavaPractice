package com.pattern.singleton;

public class UnBreakableSingleton {

    private static UnBreakableSingleton instance;

    private UnBreakableSingleton(){
        throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
    }

    public static UnBreakableSingleton getInstance(){
        if (instance == null){
            synchronized (UnBreakableSingleton.class){
                if (instance == null){
                    instance = new UnBreakableSingleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolver(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not allowed.");
    }
}
