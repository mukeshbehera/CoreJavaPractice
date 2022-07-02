package com.concept;

import java.io.Serializable;

public class SingeltonTest{
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
}





class Singleton implements Serializable{


	private static Singleton instance = null;
	
	
	private Singleton() {}
	
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	//prevent from getting serialized or deserialized
	protected Object readResolver() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
