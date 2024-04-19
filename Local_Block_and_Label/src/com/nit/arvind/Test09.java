//Local block with Label
package com.nit.arvind;

public class Test09 {
	void m1() {
		//LB1
		LB1:{
			System.out.println("LB1");
			//LB2
			LB2:{
				System.out.println("LB2");
				
				for (int i = 1; i <= 10; i++) {
					System.out.println("In loop i: " + i);
					if(i==5)
						break LB1;
				}
				System.out.println("After loop in Local block2");
			}
			System.out.println("after local block 2 in local block 1");
		}
		System.out.println("after local block 1 in method");
	}
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		test.m1();
	}
}
