package com.nt.multithreading;
/*
 * Approach #2: by implementing Runnable interface
 * 1. creating a new class deriving from RUnnable interface
 * 2. implement run() method with the logic in need to execute in custom thread
 * 3. creating this implementation class object
 * 4. also creating Thread class object by passing this Runnable object
 *    and call start() methods by using Thread class object 
 */
public class Test04_MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		Test04_MyRunnable mr = new Test04_MyRunnable();
		//mr.start();
		
		Thread th1 = new Thread(mr);
		th1.start();
				//JVM calls th1.run();
				///			mr.run();
		System.out.println("main end");
	}

}
