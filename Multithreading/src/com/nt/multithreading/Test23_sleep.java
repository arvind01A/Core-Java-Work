package com.nt.multithreading;

class MyThread13 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test23_sleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread13 mt1 = new MyThread13();
		mt1.start();
		
		Thread.sleep(5000);	//forcing Thread scheduler to pause
		
		System.out.println("main end");
	}
}
