package com.nt.String;

import java.util.Scanner;

/*
 * How many ways we can create String object?
 * 	1. by using literal
 * 	2. by using new kw and constructor

 * What are the differences between above 2 approaches?
 * 	1. String pooling and 
 * 	2. Number of objects creation
 * 
 * #1:
 * 		- In literal object comes under pooling, means
 * 		  new object is not create when we repeat same literal with same case
 * 		- In new keyword approach always new object is created
 * 
 * #2: 
 * 		- In literal approach 0 or 1 object is created  
 * 		- In new kw  approach 1 or 2 objects are created  
 * 
 * How many ways we can generate String object?
 * 	1. by using literal
 * 	2. by using new kw and constructor
 * 	3. by using concatenation (+) operator
 * 	4. by using String class mutable methods
 * 	5. by reading data from keyboard 
 *	
 *	in 3, 4 and 5 approaches String object is not come under pooling
 *  always new object is created
 *  
 *   Note: in + operator if both operands are String literals
 *         then 0 or 1 object is created.
 * 
 */

public class Test03_DiffWaysofCreatingStringObject {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		String s1 = "a";											System.out.println(s1);
//		String s2 = new String("b");					System.out.println(s2);
//		String s3 = "c" + "d";								System.out.println(s3);
//		String s4 = s1.toUpperCase();				System.out.println(s4);
//		String s5 = scn.next();								System.out.println(s5);
		
		//If literal is repeated, new object is not created
		String st1 = "AK";		//1
		String st2 = "AK";		//0
		System.out.println(st1 == st2);
		
		String st3 = new String("Nit");		//2
		String st4 = new String("Nit");		//1
		System.out.println(st3 == st4);
		
		String st5 = new String("AK");		//1
		String st6 = "Nit";							//0
		
		String st7 = "A" + "K";		//0
		//String st7 = "AK";				//0
		System.out.println(st1 == st7);
		
		String st8 = st1 + st3;		//1
		String st9 = st1 + st3;		//1
		System.out.println(st8 == st9);
		
		String st10 = st1.toLowerCase();
		String st11 = st1.toLowerCase();
		System.out.println(st10 == st11);
		
		String st12 = scn.next();
		String st13 = scn.next();
		System.out.println(st12 == st13);
	}
}
