package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserializationTransient {

	int eid;
	String ename;

	SerializationDeserializationTransient(int eid,String ename)
	{this.eid=eid;
	this.ename=ename;
	}

	public static void main(String[] args) throws Exception {
		SerializationDeserializationTransient obj = new SerializationDeserializationTransient(111, "ratan");
		
		// serialization [write the object to file]
		FileOutputStream fos = new FileOutputStream("src/com/IO/ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("serialization completed");
		
		
		
		// deserialization [read object form text file]
		FileInputStream fis = new FileInputStream("src/com/IO/ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationDeserializationTransient obj1 = (SerializationDeserializationTransient) ois.readObject();// returns Object
		System.out.println(obj1.eid + "----" + obj1.ename);
		System.out.println("de serialization completed");
	}
}
