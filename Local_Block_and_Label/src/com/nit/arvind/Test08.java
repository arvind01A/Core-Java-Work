package com.nit.arvind;

public class Test08 {
	void m1() {
		//with label
		outer:for (int i = 1; i <=10; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j);
				
				if(j==3)
					break outer;		//Label
			}
		}
	}
	
	public static void main(String[] args) {
		Test08 test = new Test08();
		test.m1();
	}
}
