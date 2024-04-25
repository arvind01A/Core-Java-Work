package com.arvind.This;

public class Test03 {
	int x = 10;
	void m1() {
		System.out.println(x);
		x = 20;
	}
	
	public static void main(String[] args) {
		Test03 t1 = new Test03();
		t1.x = 15;
		t1.m1();
		System.out.println(t1.x);
	}
}
