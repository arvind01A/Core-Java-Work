/*Case #1: The LV created inside a LB , can recreated inside 
					the same method after this LB, we will not get any CE,
					because this LV scope is already end.
*/
package com.nit.arvind;

public class Test03 {
	static void m1() {
		int p = 20;
		
		{
			int q = 30;
			System.out.println("In side local block q: " + q);
		}
		
		int q = 40;
		System.out.println("here we are recreating after local block q: " + q);
	}
	public static void main(String[] args) {
		m1();
	}
}
