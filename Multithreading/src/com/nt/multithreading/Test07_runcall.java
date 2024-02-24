package com.nt.multithreading;

class MyThread3 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test07_runcall {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread3 mt = new MyThread3();
		
		//mt.start();
		
		mt.run();		//custom thread is not created
														//it is executed in main thread
														//execution is sequential
		
		System.out.println("main end");
	}
}
