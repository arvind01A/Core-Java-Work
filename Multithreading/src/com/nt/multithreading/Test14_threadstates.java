package com.nt.multithreading;

class MyThread8 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println("In run 	#3: " + getState());
		
		System.out.println("In run is paused");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("run end");
	}
}

public class Test14_threadstates {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread8 mt1 = new MyThread8();
		System.out.println("In main #1: " + mt1.getState());
		
		mt1.start();
		System.out.println("In main #2: " + mt1.getState());
		
		Thread.sleep(3000);
		System.out.println("In main #4: " + mt1.getState());
		
		Thread.sleep(7000);
		System.out.println("In main #5: " + mt1.getState());
		
		System.out.println("main end");
	}
}
