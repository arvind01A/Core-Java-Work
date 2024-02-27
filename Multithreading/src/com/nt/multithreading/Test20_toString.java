//Test20_toString.java
package com.nt.multithreading;

public class Test20_toString {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		
		System.out.println(th1);		//Thread[id, name, priority, groupname] 
												//toString() method return value is printed
												//it may be this printing object state or 
												//classname@hahscode in hexa string format
		
		Thread th2 = new Thread("Child2");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		
		th3.setPriority(7);
		
		Thread th4 = new Thread();
		System.out.println(th4);
	}
}
