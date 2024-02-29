package com.nt.String;

/*
 * 2. How many ways we can store sequence of characters in a Java program?
 * 		1. char[] array object
 * 		2. String class object
 * 		3. StringBuffer class object
 * 		4. StringBuilder class object
 * 
 * Problems with char[]
 * 	1. we must type extra characters ' ' , for each character
 * 	2. not easy to type, read and understand
 * 
 * 	Solution: String object, here we use just "characters"
 * 
 * Problem with String object
 * 	 	1. The String object is immutable, 
 * 				means for every modification
 *    	   		it creates and return new String object with the result.
 *    
 *   	2. Due to this number of objects creation performance is decreased
 *   		application execution is slow because more memory and more time is 
 *   		consumed 
 *   
 *   Solution: StringBuffer is mutable object, means the modifications are
 *   			stored in same current object 
 * 
 * Problem with StringBuffer:
 * 		1. StringBuffer is synchronized object means thread-safe
 * 		2. Due to synchronization in STMA and MLO it given less performance
 * 
 * 	Solution: StringBuilder, it is non-synchronized, so that object is not
 * 		locked and unlocked. Hence it given high performance in STMA and MLO
 * 
 * What is a String, StringBuffer and StringBuilder?
 * 	- A String is immutable sequence of characters
 * 	- A StringBuffer is a thread-safe mutable sequence of characters
 * 	- A StringBuilder is a non thread-safe mutable sequence of characters
 * 
 * When to use String, StringBuffer and StringBuilder?
 *  - For immutable string, we will use String object
 *  - For thread-safe mutable object, we will use StringBuffer
 *  - For non-thread-safe mutable object, we will use StringBuilder
 *    
 */

public class Test02_DiffwaysOfStoringStringData {
	public static void main(String[] args) {
		
		char[] ch = {'A','r', 'v', 'i', 'n', 'd', ' ' , 'k','u','m','a','r' };
		
		String s1 = "Arvind";
		StringBuffer sb1 = new StringBuffer("Arvind");
		StringBuilder sb2 = new StringBuilder("Arvind");
		
		System.out.println(s1.concat(" kumar"));
		System.out.println(s1);
		
		System.out.println(sb1.append(" kumar"));
		System.out.println(sb1);
	}
}
