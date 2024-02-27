package com.nt.multithreading;

class Add {
	private int x;
	private int y;
	
	public synchronized void add(int x, int y) {
		System.out.println("\n" + Thread.currentThread().getName() + " start");
		this.x = x;
		this.y = y;
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		int res = this.x + this.y;
		System.out.println(Thread.currentThread().getName() + " res is: " + res);
		
		System.out.println(Thread.currentThread().getName() + " end");
	}
}

class Thread1 extends Thread {
	private Add a;
	public Thread1(Add a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add(50, 60);
	}
}

class Thread2 extends Thread {
	private Add a;
	public Thread2(Add a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add(70, 80);
	}
}

public class Test26_synchronized {
	public static void main(String[] args) {
//		Add a = new Add();
		
//		Thread1 th1 = new Thread1(a);
//		Thread2 th2 = new Thread2(a);
		
		Add a1 = new Add();
		Add a2 = new Add();
		
		Thread1 th1 = new Thread1(a1);
		Thread2 th2 = new Thread2(a2);
		
		th1.start();
		th2.start();
	}
}
