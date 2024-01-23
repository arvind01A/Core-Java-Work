package com.nit.hk.collection;

import java.util.LinkedHashSet;

public class Test04_Set_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		System.out.println("size                 :"+lhs.size());
		System.out.println();
		
		System.out.print(lhs.add("a")); 	System.out.println("\t\t"+lhs);
										//e1.hashCode() ----> 97%16 = 1
		System.out.print(lhs.add("b"));	System.out.println("\t\t"+lhs);
										//e2.hashCode() ----> 98%16 = 2
		System.out.print(lhs.add(5));	    System.out.println("\t\t"+lhs);
										//e3.hashCode() ----> 5%16 = 5
		System.out.println(lhs.add(6.7));
		System.out.print(lhs.add(null));	    System.out.println("\t\t"+lhs);
										//e4.hashCode() --->0
		System.out.print(lhs.add(true));	    System.out.println("\t\t"+lhs);
										//e5.hashCode() ---> 1231%16 ---> 15
															/*
															 * System.out.println(((Boolean)true).hashCode());
															 * System.out.println(((Integer)6).hashCode()); System.out.println(6%16);
															 * System.out.println(((Double)6.7).hashCode());
															 * System.out.println(-1932132351%16); System.out.println(~-15%16);
															 * System.out.println(((Character)'p').hashCode());
															 * System.out.println(((Character)'a').hashCode());
															 */
		System.out.print(lhs.add('p'));		System.out.println("\t\t"+lhs);
		System.out.print(lhs.add(97));		System.out.println("\t\t"+lhs);
		System.out.print(lhs.add(98));		System.out.println("\t\t"+lhs);
		System.out.print(lhs.add(true));	    System.out.println("\t"+lhs);
		System.out.print(lhs.add(new String("a")));	System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Integer(97))); System.out.println("\t"+lhs);
		System.out.println();

		System.out.print(lhs.add(new Ex(5,6))); 	System.out.println("\t\t"+lhs);
		System.out.print(lhs.add(new Sa(5,6)));    System.out.println("\t\t"+lhs);
		System.out.print(lhs.add(new Sa(5,6)));    System.out.println("\t"+lhs);
		System.out.print(lhs.add(new Ex(6,6)));    System.out.println("\t\t"+lhs);
		System.out.println("size                 :"+lhs.size());
	}

}
