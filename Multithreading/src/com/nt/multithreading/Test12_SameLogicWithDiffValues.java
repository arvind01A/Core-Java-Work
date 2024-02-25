package com.nt.multithreading;

class MyThread7 extends Thread {
	private int x;
	
	public MyThread7(int x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= x; i++) {
			System.out.println(getName()  + " run i: " + i);
		}
	}
}

public class Test12_SameLogicWithDiffValues {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread7 mt1 = new MyThread7(10);
		MyThread7 mt2 = new MyThread7(15);
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");
	}
}
