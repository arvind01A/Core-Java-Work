package com.nt.String;

public class Test05_Constructors {
	public static void main(String[] args) {
		
		String s1 = new String();
		
		String s2 = new String("abc");
		String s3 = new String(new StringBuffer());
		String s4 = new String(new StringBuilder());
		
		char[] ch = {'a', 'b','c','d','e','f'};
		String s5 = new String(ch);
		String s6 = new String(ch, 2, 3);
		
		byte[] b = {97, 98, 99, 100, 101, 102};
		String s7 = new String(b);
		String s8 = new String(b, 1, 3);
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("s5: " + s5);
		System.out.println("s6: " + s6);
		System.out.println("s7: " + s7);
		System.out.println("s8: " + s8);
	}
}
