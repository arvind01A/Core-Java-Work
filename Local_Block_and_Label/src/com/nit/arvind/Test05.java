/*
 * Case #3: We can access method level LV inside a LB either for
 * 				reading or for modifying its value. If we assign a new value
 * 				to a method level LV, that value is stored inside the same
 * 				memory that is created at method level before LB as show
 * 				in above program for the variable 'p'.
 */
package com.nit.arvind;

public class Test05 {
	static void m1() {
		int p = 10;
		
		{
			p = 20;
			int q = 30;
		}
		
		p = 40;
		int q = 50;
	}
}