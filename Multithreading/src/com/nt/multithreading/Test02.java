package com.nt.multithreading;
/*
 * What is a thread?
 * 		- A thread is an independent sequential flow of execution path
 * 
 * What is a multithreading and its advantage?
 * 		- The process of creating multiple threads in JSA
 * 	for executing multiple independent tasks at a time concurrently
 * 	to complete their execution flow fast by using CPU ideal time effectively
 * 
 * What is a custom thread, why custom thread?
 * 	- A thread that is newly created by developer
 * 		is called custom thread. it is used for running
 * 		independent tasks concurrently
 *
 *	How can we create a custom thread?
 * - by using predefined class Thread available in java.lang package 
 * 
 *  1. Create Thread class object
 *  2. Call start() method on this thread object
 *  
 * How can we execute our logic in this custom thread?
 * 	- By using run() method
 * 
 *  - To execute logic in a custom thread
 *    we must place that logic in run() method
 *    by overriding  
 *    	1. either from Thread class or from
 *    	2. Runnable interface
 *    
 * How many ways we can create custom thread?
 * 	In three ways
 * 	1. By extending from Thread class
 * 	2. By implementing from Runnable interface
 * 	3. By implementing from Callable<T> interface
 *  
 * Basically we can create a thread only by using Thread class
 * as shown below. The problem in this approach
 * we can not execute our logic in custom thread
 * 
 * for executing logic in custom thread we must place that logic
 * in run() method.
 * 
 * above three approaches are meant for supplying logic 
 * to execute in custom thread
 * 
 *How many ways we can create custom thread?
 * 	For creating custom thread and for executing logic in 
 * custom thread we have three ways
 * 	1. By extending from Thread class
 * 	2. By implementing from Runnable interface
 * 	3. By implementing from Callable<T> interface
 * 
 * 
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread th1 = new Thread();
		th1.start();
		//-> calls JVM -> JVM creates custom thread -> then calls th1.run();
		
		System.out.println("main end");
	}
}
