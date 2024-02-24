package com.nt.multithreading;

class MyThread6 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test10_MultipleThreads {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread6 mt1 = new MyThread6();
		mt1.start();
		
		MyThread6 mt2 = new MyThread6();
		mt2.start();
		
		System.out.println("main end");
	}
}
