package com.nt.String;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String s1 = "HK";		//String literal		//here 1 object created
			String s2 = "HK";										//here 0 object here pooling concept
			
			String s3 = new String("NiT");	//String object 		//here 2 object created
			String s4 = new String("NiT"); 										//here 1 object created
			
			String s5 = s1.toLowerCase();	//String object to method		//here 1 obj created
			String s6 = s1.toLowerCase();															//here 1 obj created
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
			
			String s7 = sc.next();	//here 1 obj created
			String s8 = sc.next();	//here also 1 obj created
			
			String s9 = "H" + "K";		//here 0 object created
			String s10 = s1;				//here 0 object created
			
			String s11 = s1 + s3;		//here 1 object created
			String s12 = s1 + s3;		//here also 1 object created
			
			
			System.out.println(s7);
			System.out.println(s8);
			System.out.println(s9);
			System.out.println(s10);
			System.out.println(s11);
			System.out.println(s12);
	}
}
