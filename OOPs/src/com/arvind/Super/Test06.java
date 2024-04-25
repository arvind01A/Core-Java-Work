//super.
package com.arvind.Super;

class A1 {
	int x = 10;
}
class B1 extends A1 {
	int x = 50;
	
	void m1() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Test06 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.m1();
	}
}
