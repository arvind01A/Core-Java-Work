package com.nt.multithreading;

class MyThread5 extends Thread {
	
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

public class Test09_startMultipletimes {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread5 mt = new MyThread5();
		mt.start();
		//mt.start();
		
		System.out.println("main end");
	}
}
