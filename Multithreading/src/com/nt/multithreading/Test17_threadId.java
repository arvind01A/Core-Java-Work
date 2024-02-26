//Test17_threadId.java
package com.nt.multithreading;

public class Test17_threadId {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("child1");
		Thread th2 = new Thread("child2");
		
		System.out.println(th1.getName() + " " + th1.getId() + " " + th1.threadId());
		System.out.println(th2.getName() + " " + th2.getId() + " " + th2.threadId());
	}
}
