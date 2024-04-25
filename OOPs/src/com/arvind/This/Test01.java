package com.arvind.This;

public class Test01 {
	Test01(){
		System.out.println("Test01()");
	}
	void m1() {
		System.out.println("Test01.m1()");
	}
	
	public static void main(String[] args) {
		Test01 t1 = new Test01();
	}
}
