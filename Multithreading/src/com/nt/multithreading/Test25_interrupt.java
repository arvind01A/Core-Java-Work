package com.nt.multithreading;
class MyThread15 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class Test25_interrupt {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread15 mt1 = new MyThread15();
		//mt1.interrupt();	//calling before mt1 thread is entered sleep state
		
		mt1.start();
		//mt1.interrupt();	//calling before mt1 thread is entered sleep state
		
		Thread.sleep(2000);
		
		mt1.interrupt();	//mt1 thread is taken out from sleep state
		
		System.out.println("main end");
	}
}
