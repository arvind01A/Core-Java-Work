//Test31_WaitRule.java
package com.nt.multithreading;

class WaitRule {
	//void m1() {
	synchronized void m1() {
		System.out.println("m1 start");
		
		try {
			//wait()
			wait(5000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("m1 end");
	}
}

public class Test31_WaitRule {
	public static void main(String[] args) {
		WaitRule r1 = new WaitRule();
		r1.m1();
	}
}
