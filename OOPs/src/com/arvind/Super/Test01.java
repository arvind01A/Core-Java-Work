package com.arvind.Super;

class A {
	A(){
		System.out.println("A constuctor");
	}
	int x = 10;
	void m1() {
		System.out.println("m1 is exe from class A");
	}
}
class B extends A {
	B(){
		super();
		System.out.println(super.x);
		super.m1();
	}
}
public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
	}
}
