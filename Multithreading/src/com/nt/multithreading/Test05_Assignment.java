package com.nt.multithreading;
/*
 * Develop a multithread program to execute two tasks concurrently
 *  1. task #1: print 1-20
 *  2. task #2: print 20-1
 *  
 *  implement this code in both approaches
 *  	extends Thread and
 *  	implements Runnable 
 *  
 */
class MyThread2 extends Thread {
	@Override
	public void run() {
			//task #2:
			for (int i = 20; i >= 1; i--) {
				System.out.println("run i: " + i);
			}
	}
}
public class Test05_Assignment {
	public static void main(String[] args) {
		
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		
		//task #1:
		for (int i = 1; i <= 20; i++) {
			System.out.println("main i: " + i);
		}
	}
}
