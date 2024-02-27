//Test22_yield.java
package com.nt.multithreading;

class MyThread12 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test22_yield {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread12 mt1 = new MyThread12();
		mt1.start();
		
		Thread.yield();		//requesting Thread scheduler
		
		System.out.println("main end");
	}
}
