//Test27_synchronization_classlock.java
package com.nt.multithreading;

class Add2 {
	private static int x;
	private static int y;
	
	public static synchronized void add(int x , int y) {
		System.out.println("\n" + Thread.currentThread().getName() + " start");
		Add2.x = x;
		Add2.y = y;
		
		try { Thread.sleep(5000); }
		catch(InterruptedException ie) { ie.printStackTrace(); }
		
		int res = Add2.x + Add2.y;
		System.out.println(Thread.currentThread().getName() + " res is: " + res);
		
		System.out.println(Thread.currentThread().getName() + " end");
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		Add2.add(50, 60);
	}
}

class Thread4 extends Thread {
	@Override
	public void run() {
		Add2.add(70, 80);
	}
}

public class Test27_synchronization_classlock {
	public static void main(String[] args) {
		
		Thread3 th1 = new Thread3();
		Thread4 th2 = new Thread4();
		
		th1.start();
		th2.start();
	}
}
