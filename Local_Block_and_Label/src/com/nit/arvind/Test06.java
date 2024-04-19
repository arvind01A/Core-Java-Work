package com.nit.arvind;

public class Test06 {
	static void m1() {
		int p = 10;
		
		{
			System.out.println(p);
			p =  20;
			System.out.println(p);
		}
		
		System.out.println(p);
	}
	public static void main(String[] args) {
		m1();
	}
}
