package com.arvind.Polymorphism;

class A {
	static void m1() {
		System.out.println("A m1()");
	}
	
	void m2() {
		System.out.println("A m2()");
	}
	
	static void m3() {
		System.out.println("A m3() no-param");
	}
	
	int m3(String s) {
		System.out.println("A m3 String-param");
		return 50;
	}
}

class B extends A {
	static void m1() {
		System.out.println("B m1()");
	}
	
	void m2() {
		System.out.println("B m2()");
	}
	
	void m3(float f, int x) {
		System.out.println("B m3 float, int param");
	}
	
}
public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3(10.0f, 5);
		System.out.println();
		
		A a1 = new A();
		a1.m1();
		a1.m2();
		a1.m3();
		System.out.println(a1.m3("Hello"));
		System.out.println();
		
		A a2 = new B();
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println(a2.m3("Hello"));
		//a2.m3(10.0f, 7); CE because m3(float, int) method not a2 class method overloading in a2 class just m3(String) param method only overload
	}
}
