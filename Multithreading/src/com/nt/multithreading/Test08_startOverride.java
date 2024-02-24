package com.nt.multithreading;

class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
	
	@Override
	public void start() {
		System.out.println("start executed");	//mandatory logic to be executed
																												//before every thread starts
		
		super.start();	//for starting custom thread and 		
																	//for executing run() method
	}
}
public class Test08_startOverride {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread4 mt = new MyThread4();
		
		mt.start();
		
		System.out.println("main end");
	}
}
