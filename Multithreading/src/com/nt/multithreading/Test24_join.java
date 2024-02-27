//Test24_join.java
package com.nt.multithreading;

class MyThread14 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("run end");
	}
}

public class Test24_join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread14 mt1 = new MyThread14();
		mt1.start();
		
		//mt1.join();				//forcing Thread scheduler to pause
		//mt1.join(3000);	//forcing Thread scheduler to pause
		//mt1.join(7000);	//forcing Thread scheduler to pause
		mt1.sleep(7000);		//forcing Thread scheduler to pause
		
		System.out.println("main end");
	}
}
