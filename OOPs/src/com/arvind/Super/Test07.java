package com.arvind.Super;

class A2 {
	static int a = 10;
	int x = 20;
}
class B2 extends A2 {
	static int a = 30;
	static int b = 40;
	int x = 50;
	int y = 60;
	
	void m1() {
		System.out.println(a + "     " + super.a);
		System.out.println(x + "     " + super.x);
		System.out.println(b + "     " + y);
		//System.out.println(super.b + "     " + super.y);
	}
}
public class Test07 {
	public static void main(String[] args) {
		B2 b1 = new B2();
		b1.m1();
	}
}
