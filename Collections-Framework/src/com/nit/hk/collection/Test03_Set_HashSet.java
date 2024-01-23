package com.nit.hk.collection;

import java.util.HashSet;

public class Test03_Set_HashSet {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		
		System.out.println("size                 :"+hs.size());
		System.out.println();
		
		System.out.print(hs.add("a")); 	System.out.println("\t\t"+hs);
										//e1.hashCode() ----> 97%16 = 1
		System.out.print(hs.add("b"));	System.out.println("\t\t"+hs);
										//e2.hashCode() ----> 98%16 = 2
		System.out.print(hs.add(5));	    System.out.println("\t\t"+hs);
										//e3.hashCode() ----> 5%16 = 5
		System.out.println(hs.add(6.7));
		System.out.print(hs.add(null));	    System.out.println("\t\t"+hs);
										//e4.hashCode() --->0
		System.out.print(hs.add(true));	    System.out.println("\t\t"+hs);
										//e5.hashCode() ---> 1231%16 ---> 15
															/*
															 * System.out.println(((Boolean)true).hashCode());
															 * System.out.println(((Integer)6).hashCode()); System.out.println(6%16);
															 * System.out.println(((Double)6.7).hashCode());
															 * System.out.println(-1932132351%16); System.out.println(~-15%16);
															 * System.out.println(((Character)'p').hashCode());
															 * System.out.println(((Character)'a').hashCode());
															 */
		System.out.print(hs.add('p'));		System.out.println("\t\t"+hs);
		System.out.print(hs.add(97));		System.out.println("\t\t"+hs);
		System.out.print(hs.add(98));		System.out.println("\t\t"+hs);
		System.out.print(hs.add(true));	    System.out.println("\t"+hs);
		System.out.print(hs.add(new String("a")));	System.out.println("\t"+hs);
		System.out.print(hs.add(new Integer(97))); System.out.println("\t"+hs);
		System.out.println();
		
		System.out.print(hs.add(new Ex(5,6))); 	System.out.println("\t\t"+hs);
		System.out.print(hs.add(new Sa(5,6)));    System.out.println("\t\t"+hs);
		System.out.print(hs.add(new Sa(5,6)));    System.out.println("\t"+hs);
		System.out.print(hs.add(new Ex(6,6)));    System.out.println("\t\t"+hs);
		System.out.println("size                 :"+hs.size());
	}

}
