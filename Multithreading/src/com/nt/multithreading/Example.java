package com.nt.multithreading;

import java.util.Scanner;

public class Example {
	static void m1() {
		System.out.println("m1");
	}
	
	static void m2() {
		System.out.println("m2");
		Scanner sc = new Scanner(System.in);
		System.out.println("reading data in m2() method");
		System.out.println("enter data: ");
		String data = sc.nextLine();
		System.out.println("You entered: " + data);
	}
	
	static void m3() {
		System.out.println("m3");
	}
}
