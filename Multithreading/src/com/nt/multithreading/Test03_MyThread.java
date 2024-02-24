package com.nt.multithreading;
/*
 * Approach #1: extending from Thread class
 * 1. create a class deriving from class Thread
 * 2. overriding run() method and place logic to execute in custom thread
 * 3. create this sub class object and call start() method
 * 
 */
//#1:
public class Test03_MyThread extends Thread {
	
		//#2:
		@Override
		public void run() {
			System.out.println("run");
		}
		
		public static void main(String[] args) {
			System.out.println("main start");
			
			//#3:
			Test03_MyThread mt1 = new Test03_MyThread();
			mt1.start();
						//1. requests JVM to create custom thread for mt1 object
						//2. requests JVM to call run() method from mt1 object class in this CT
					
			System.out.println("main end");
		}
}
