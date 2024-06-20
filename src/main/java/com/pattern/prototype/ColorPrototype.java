package com.pattern.prototype;// A Java program to demonstrate working of
// Prototype Design Pattern with example 
// of a ColorStore class to store existing objects.

import java.util.HashMap;
import java.util.Map;

// Cloneable interface allows the implementing class to 
// have its objects to be cloned instead of using a new operator. 
// It is available in Java.lang.Cloneable.

abstract class ColorPrototype implements Cloneable{
	protected String colorName;
	abstract void addColor();

	@Override
	protected Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
}

class blueColor extends ColorPrototype
{
	public blueColor() 
	{
		this.colorName = "blue";
	}

	@Override
	void addColor() 
	{
		System.out.println("Blue color added");
	}
	
}

class blackColor extends ColorPrototype {

	public blackColor()
	{
		this.colorName = "black";
	}

	@Override
	void addColor() 
	{
		System.out.println("Black color added");
	}
}

class ColorStore {

	private static Map<String, ColorPrototype> colorMap = new HashMap<String, ColorPrototype>();
	
	static
	{
		colorMap.put("blue", new blueColor());
		colorMap.put("black", new blackColor());
	}
	
	public static ColorPrototype getColor(String colorName)
	{
		return (ColorPrototype) colorMap.get(colorName).clone();
	}
}


// Driver class
class Prototype
{
	public static void main (String[] args)
	{
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
	}
}
