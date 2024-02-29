package com.nt.String;

public class Test06_StringOperations {
	public static void main(String[] args) {
		
		String s1 = "abc";
/*		
		//#1:
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		
		//#2:
		System.out.println(s1.length());
		System.out.println(s1.length() == 0);
		
		String s3 = "abc";
		String[] s4 = {"abc", "bbc"};
		System.out.println(s3.length());		//method
		System.out.println(s4.length);			//variable
*/		
		//#3:
		System.out.println(s1);		//toString() method is overridden int String class
		System.out.println(s1.toString());
		
		//#4:
		s1 = "abc";
		int num = s1.hashCode();
		System.out.println(num);
		System.out.println();
		
		//#5:
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "Abc";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println();
		
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
		
		System.out.println(s1.compareTo(s2));			// abc - abc -> 0
		System.out.println(s1.compareTo(s3));			// abc - abc -> 0
		System.out.println(s1.compareTo(s4));			// abc - Abc -> 97 - 65 -> 32
		System.out.println(s1.compareToIgnoreCase(s4));  // abc - abc -> 0
		System.out.println();
		
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("Abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(sb1));
		System.out.println(s1.contentEquals(sb1));
		System.out.println(s1.contentEquals(sb2));
		//System.out.println(s1.contentEqualsIgnoreCase(sb2));
		System.out.println(s1.toLowerCase().contentEquals(sb1.toString().toLowerCase()));
	}
}
