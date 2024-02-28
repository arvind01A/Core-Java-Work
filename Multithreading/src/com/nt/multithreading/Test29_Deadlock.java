//Test29_Deadlock.java
package com.nt.multithreading;

class A {
	synchronized void m1(B b) {
		System.out.println("A m1 start");
		
		try { Thread.sleep(5000); }
		catch(InterruptedException ie) { ie.printStackTrace(); }
		
		System.out.println("Before b.m4() method calling");
		
		b.m4();
		
		System.out.println("A m1 end");
	}
	
	synchronized void m2() {
		System.out.println("A m2 executed");
	}
}

class B {
	synchronized void m3(A a) {
		System.out.println("B m3 start");
		
		try { Thread.sleep(5000); } 
		catch(InterruptedException ie) { ie.printStackTrace(); } 
		
		System.out.println("Before a.m2() method calling");
		a.m2();
		
		System.out.println("B m3 end");
	}
	
	synchronized void m4() {
		System.out.println("B m4 is executed");
	}
}

class AThread extends Thread {
	private A a1;
	private B b1;
	
	public AThread(A a1, B b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	@Override
	public void run() {
		a1.m1(b1);
	}
}

class BThread extends Thread {
	private A a1;
	private B b1;
	
	public BThread(A a1, B b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	@Override
	public void run() {
		b1.m3(a1);
	}
}

public class Test29_Deadlock {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		
		AThread at = new AThread(a1, b1);
		BThread bt = new BThread(a1, b1);
		
		at.start();
		bt.start();
	}
}
