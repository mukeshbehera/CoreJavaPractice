package com.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * newSingleThreadExecutor() can run one thread at a time
 * second thread will run only after the execution of first thread
 * 
 * newFixedThreadPool(2) - two threads can run simultaneously.
 * Only after execution of these two task more task can run
 */

public class ExecutorsServiceRunner {

	public static void main(String[] args) {
		
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		executorService.execute(new Task(1));
//		executorService.execute(new Thread(new Task(2)));
		
		ExecutorService fixedExecutorService = Executors.newFixedThreadPool(2);
		fixedExecutorService.execute(new Task(1));
		fixedExecutorService.execute(new Task(2));
		fixedExecutorService.execute(new Task(3));
		fixedExecutorService.execute(new Task(4));
		fixedExecutorService.execute(new Task(5));
		
		
		
		
		
		//Task 3
		System.out.println("Task 3 Kicked Off");
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task 3 done");
		
		System.out.println("Main Done");
	}
}
