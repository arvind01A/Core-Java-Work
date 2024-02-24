package com.nt.multithreading;

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		//task	 #2 : 
		for (int i = 20; i >= 1; i--) {
			System.out.println("run i: " + i);
		}
	}
}

public class Test06_Assignment {
	public static void main(String[] args) {
			
		MyRunnable2 mr = new MyRunnable2();
		
		Thread th1 = new Thread(mr);
		th1.start();
		
		//task #1:
		for (int i = 1; i <= 20; i++) {
			System.out.println("main i: " + i);
		}
		
	}
}
