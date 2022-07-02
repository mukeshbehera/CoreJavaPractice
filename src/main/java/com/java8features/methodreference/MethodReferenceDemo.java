package com.java8features.methodreference;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		System.out.println("Learning Method Reference");
		
		//providing the implementation of WorkInterfece
		
		
		//using Lamda expression
		WorkInterface workInterfaceLamda = () -> {
			System.out.println("This is doTask method from WorkInterface using Lamda Expresion");
		};
		workInterfaceLamda.doTask();
		
		
		//static method reference 1 ( ClassName::methodName )
		WorkInterface workInterfaceMethodReference = Stuffs::doStuffs; 
		//body of the static doStuff() method of Stuffs class is here acting as doTask() implementation of MethodInterface
		workInterfaceMethodReference.doTask();
		
		//static method reference 2
		Runnable runnable = Stuffs::threadTask;
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		
		//instance(non-static) method reference ( Object::methodName )
		Stuffs obj = new Stuffs();
		Runnable runnable2 = obj::printNumbers;
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		
		
	}
}
