//Test15_threadpriority.java
package com.nt.multithreading;

class MyThread9 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(getName() + " i: " + i );
		}
	}
}

public class Test15_threadpriority {
	public static void main(String[] args) {
		MyThread9 mt1 = new MyThread9();
		MyThread9 mt2 = new MyThread9();
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		
		mt1.setPriority(7);
		mt2.setPriority(9);
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println();
		
		//mt1.setPriority(0);		//RE: IllegalArgumentException
		//mt2.setPriority(11);	//RE: IllegalArgumentException
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
	}
}
