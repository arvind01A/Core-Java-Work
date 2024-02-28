//Test32_Callable.java
package com.nt.multithreading;

import java.util.concurrent.Callable;

class ExRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("ExRunnable run");
	}
}

class ExThread extends Thread {
	@Override
	public void run() {
		System.out.println("ExThread run");
	}
}

class ExCallable implements Callable<Integer> {
	
	@Override
	public Integer call() throws Exception {
		System.out.println("ExCallable call");
		return 5;
	}
}

public class Test32_Callable {
	public static void main(String[] args) {
		
		ExThread th1 = new ExThread();
		th1.start();
		
		Thread th2 = new Thread(new ExRunnable());
		th2.start();
		
		//Thread th3 = new Thrad(new ExCallable());
		//th3.start();
	}
}
