package com.arvind.This;

class Example {
	int x;
	
	void m1() {
		x = 50;
	}
	
	void m2() {
		System.out.println(x);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Example e1 = new Example();
		
		System.out.println(e1.x);
		e1.m2();
		
		e1.x = 30;
		
		System.out.println(e1.x);
		e1.m2();
		
		e1.m1();
		System.out.println(e1.x);
		e1.m2();
	}
}
