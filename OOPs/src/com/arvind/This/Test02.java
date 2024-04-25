package com.arvind.This;

public class Test02 {
	int x = 10;
	
	void m1() {
		System.out.println("Test02.m1() : " + this.x);
	}
	
	public static void main(String[] args) {
		Test02 t1 = new Test02();
		t1.m1();
	}
}
