//Test28_synchronedblock 
package com.nt.multithreading;

class Add3 {
	private static int x;
	private static int y;
	
	public static synchronized void add(int x , int y) {
		System.out.println("\n" + Thread.currentThread().getName() + " start");
		Add3.x = x;
		Add3.y = y;
		
		try { Thread.sleep(2000); }
		catch(InterruptedException ie) { ie.printStackTrace(); }
		
		int res = Add3.x + Add3.y;
		System.out.println(Thread.currentThread().getName() + " res is: " + res);
		
		System.out.println(Thread.currentThread().getName() + " end");
	}
}

class Thread5 extends Thread { 
	@Override
	public void run() {
		Add3.add(50, 60);
	}
}

class Thread6 extends Thread {
	@Override
	public void run() {
		Add3.add(70, 80);
	}
}

public class Test28_synchronedblock {
	public static void main(String[] args) {
		
		Thread5 th1 = new Thread5();
		Thread6 th2 = new Thread6();
		
		th1.start();
		th2.start();
	}
}
