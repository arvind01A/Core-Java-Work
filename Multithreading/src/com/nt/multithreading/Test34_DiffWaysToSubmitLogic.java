package com.nt.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 10 diff ways we can submit logic to custom thread
 * ===================================================================
 * 	1. by using outer class extending from Thread class
 * 	2. by using outer class implementing from Runnable interface
 * 	3. by using outer class implementing from Callable interface

 * 	4. by using AIC extending from Thread class
 * 	5. by using AIC implementing from Runnable interface
 * 	6. by using AIC implementing from Callable interface
 
 * 	7. by using LE implementing from Runnable interface
 * 	8. by using LE implementing from Callable interface
 
 * 	9. by using MR implementing from Runnable interface
 * 	10. by using MR implementing from Callable interface
 
 */

//Approach #1:
class MyThread21 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread run");
	}
}

//Approach #2:
class MyRunnable21 implements Runnable{
	@Override
	public void run() {
		System.out.println("MyRunnable run");
	}
}

//Approach #3:
class MyCallable2 implements Callable<String>{
	@Override
	public String call() {
		System.out.println("MyCallable run");
		return "CJ";
	}
}

public class Test34_DiffWaysToSubmitLogic {
	public static void main(String[] args) {
		
		MyThread21 mt1 = new MyThread21();
		mt1.start();
		
		Thread th2 = new Thread( new MyRunnable21());
		th2.start();
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(new MyCallable2());
		
//Approach #4:		
		new Thread() { 
			@Override
			public void run() {
				System.out.println("Thread AIC run");
			}
		}.start();
		
//Approach #5:		
		new Thread(
			new Runnable() { 
				@Override
				public void run() {
					System.out.println("Runnable AIC run");
				}
			}
		).start();
		
//Approach #6:		
		service.submit(
		  new Callable<Double>() {
			@Override
			public Double call() throws Exception {
				System.out.println("Callble AIC call");
				return 10.5;
			}
		  }
		);
		
//Approach #7:		
		new Thread(
				() -> {
					System.out.println("Runnable LE run");
				}
		).start();
		
//Approch #8:
		service.submit(() -> { 
			System.out.println("Callable LE call");
			return 5L;
		});
		
//Approach #9:		
		new Thread(
				Example10::m1
		).start();

		new Thread(
				new Example10()::m2
		).start();
	
		new Thread(
				Example10::new
		).start();
		
//Approach #10: 
		service.submit(new Example10()::m3);
		
	}
}

class Example10 {
	Example10(){
		System.out.println("Runnable NPCR run");
	}
	static void m1() {
		System.out.println("Runnable SMR run");
	}
	
	void m2() {
		System.out.println("Runnable NSMR run");
	}
	
	String m3() {
		System.out.println("Callable SMR call");
		return "abc";
	}
}