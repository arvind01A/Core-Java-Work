package com.nit.arvind;

public class Test07 {
	void m1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			if(i==5)
				break;
			
		}
		
	}
	public static void main(String[] args) {
		Test07 test = new Test07();
		test.m1();
	}
}
