package com.nt.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 														Executor			=> execute(Runnable task)
 *   															/|\
 *    															  |
 * 													ExecutorService	=>  Future submit(Runnable c)
 *   															/|\						  Future submit(Callable c)
 *   															/|\						  void shutdown()
 *   															/|\						  void shutdownNow()
 *    															  |
 * 											ScheduledExecutorService
 * 
 * Executors
 * 		static ExecutorService newSingleThreadExecutor()
 * 		static ExecutorService newFixedThreadPool(int nThreads)
 * 		static ExecutorService newCachedThreadPool()
 * 
 * 		static ScheduledExecutorServicenewSingleThreadScheduledExecutor()
 * 		static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)
 * 
 * Future<T>
 * 	T get() throws ExecutionException
 * 
 * ExecutionException
 * 
 */

class SaRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}

class SaCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		System.out.println("call executed in \'' " + Thread.currentThread().getName() + "\"");
		if(true) {
			//throw new ArithmeticException("For fun");
		}
		return 5;
	}
	
}

public class Test33_ExecutorFramwork {
	public static void main(String[] args) {
		//creating thread pool
		//ExecutorService service1 = Executors.newSingleThreadExecutor();
		//ExecutorService service1 = Executors.newFixedThreadPool(3);
		ExecutorService service1 = Executors.newCachedThreadPool();
		
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
		
		for (int i = 1; i <= 100; i++) {
			service1.submit(new SaCallable());
		}
		
		service1.shutdown();
		//service1.shutdownNow();
		System.out.println();
		
		ExecutorService service2 = Executors.newSingleThreadExecutor();
		Future<Integer> future = service2.submit(new SaCallable());
		
		try {
			Integer res = future.get();
			System.out.println();
		}
		catch(InterruptedException  ie) {
			ie.printStackTrace();
		}
		catch(ExecutionException ee) {
			ee.printStackTrace();
		}
		
		service2.shutdown();
		System.out.println("main end");
	}
}
