/*Case #2: We can not create method level LV again inside LB,
 * 				because method level LV scope is not end, its
 * 				memory is not destroyed. Hence inside LB also we 
 * 				must access the same method level LV memory.
*/
package com.nit.arvind;

public class Test04 {
	static void m1() {
		int p = 10;
		
		{
			//int p = 20;		//CE
			int q = 30;
		}
		
		p = 40;
		int q = 50;
	}
}
