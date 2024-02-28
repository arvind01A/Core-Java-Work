package com.nt.multithreading;

class Factory {
	private int items;
	private boolean itemsAvailable;
	
	synchronized void produce(int items) {
		if(itemsAvailable) {
			try {
				this.wait();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		this.items = this.items + items;
		System.out.println("Items produced: " + items);
		itemsAvailable = true;
		
		this.notify();
	}
	
	synchronized void consume(int items) {
		if(!itemsAvailable) {
			try {
				this.wait();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		this.items = this.items - items;
		System.out.println("Items consumed: " + items);
		itemsAvailable = false;
		
		this.notifyAll();
	}
}

class Producer implements Runnable {
	private Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory ;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			factory.produce(i);
		}
	}
}

class Consumer implements Runnable {
	private Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory ;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			factory.consume(i);
		}
	} 
}

public class Test30_ITC {
	public static void main(String[] args) {
		
		Factory bajaj = new Factory();
		
		Producer producer = new Producer(bajaj);
		Consumer consumer = new Consumer(bajaj);
		
		Thread th1 = new Thread(producer);
		Thread th2 = new Thread(consumer);
		
		th1.start();
		th2.start();
	}
}
