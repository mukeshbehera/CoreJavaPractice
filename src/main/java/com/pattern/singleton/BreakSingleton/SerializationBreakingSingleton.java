package com.pattern.singleton.BreakSingleton;

import com.pattern.singleton.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationBreakingSingleton {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            outputStream.writeObject(instance1);
            outputStream.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("singleton.ser"));
            instance2 = (Singleton) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }
}
