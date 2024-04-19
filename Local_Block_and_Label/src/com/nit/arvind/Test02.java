package com.nit.arvind;

public class Test02 {
	static void m1() {
		int p = 10;
		
		{
			int q = 20;
			System.out.println("In side local block p: " + p);
			System.out.println("In side local block q: " + q);
		}
		
		System.out.println("p: " + p);
		//System.out.println("q: " + q);
		//q=40;
	}
	
	public static void main(String[] args) {
		m1();
	}
}
