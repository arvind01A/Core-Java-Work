package com.nt.multithreading;
/*
 * 1. single class -> multiple instances -> call start() method
 * 		-> for executing same logic 
 * 				1. either with same values or 
 * 				2. different values
 * 
 * 2. multiple classes -> multiple instances -> call start() method
 * 		-> for executing different logic 
 * 				1. either with same values or 
 * 				2. different values
 * 
 */
class Addition extends Thread {
	@Override
	public void run() {
		System.out.println("add thread executed");
	}
}
class Subtaraction extends Thread {
	@Override
	public void run() {
		System.out.println("sub thread executed");
	}
}
public class Test11_MultipleLogics {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Addition a1 = new Addition();
		Subtaraction s1 = new Subtaraction();
		
		a1.start();
		s1.start();
		
		System.out.println("main end");
	}
}
