//Test18_mainthreadname.java
package com.nt.multithreading;

public class Test18_mainthreadname {
	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();		//retriving currently running
																														// thread's object ref
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println();
		
		th.setName("XxYY");
		th.setPriority(7);
		
		System.out.println(th.getName());
		System.out.println(th.getPriority());
	}
}
