//Test19_threadGroup.java
package com.nt.multithreading;

public class Test19_threadGroup {
	public static void main(String[] args) {
		
			Thread th1 = new Thread();
			ThreadGroup tg1 = th1.getThreadGroup();
			System.out.println(tg1.getName());
			
			Thread th2 = Thread.currentThread();
			ThreadGroup tg2 = th2.getThreadGroup();
			System.out.println(tg2.getName());
			
			ThreadGroup grpA = new ThreadGroup("Group A");
			Thread th3 = new Thread(grpA, "Child1");
			Thread th4 = new Thread(grpA, "Child2");
			System.out.println(th3.getThreadGroup().getName());
			System.out.println(th4.getThreadGroup().getName());
	}
}
