//Test21_daemonThread.java
package com.nt.multithreading;

class MyThread11 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		for (int i = 1; i <= 20; i++) {
			System.out.println("run: " + i);
		}
		System.out.println("run end");
	}
}

public class Test21_daemonThread {
	public static void main(String[] args) {
		
		Thread th1 = Thread.currentThread();
		System.out.println(th1.isDaemon());
		
		Thread th2 = new Thread();
		System.out.println(th2.isDaemon());
		
		th2.setDaemon(true);
		System.out.println(th2.isDaemon());
		
		MyThread11 mt1 = new MyThread11();
		System.out.println(mt1.isDaemon());
		
		mt1.setDaemon(true);
		mt1.start();
		//mt1.setDaemon(true);
		
		System.out.println("main end");
	}
}
