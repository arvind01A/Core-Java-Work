//Test16_threadname.java
package com.nt.multithreading;

class MyThread10 extends Thread {
	
	public MyThread10() {
		
	}
	
	public MyThread10(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName() + " i: " + i);
		}
	}
}

public class Test16_threadname {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread10 mt1 = new MyThread10();
		MyThread10 mt2 = new MyThread10();
		
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());
		System.out.println();
		
		mt1.setName("child1");
		//mt1.setName("child2");
		
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());
		System.out.println();
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
	}
}
