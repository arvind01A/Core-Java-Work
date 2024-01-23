package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Vector;

/*
 * - Enumeration is a cursor object,  
 * - It is a legacy interface, available from Java 1.2
 * 
 * - It is used for retrieving objects from legacy collections
 * 		1. Vector and
 * 		2. Hashtable
 * 
 * - For retrieving objects from a collection,
 *   we must perform two operations
 * 		1. check the element is available or not
 *  	2. retrieving element, then move cursor to next element
 *  
 * - Enumeration<E> provides two methods for performing above two operations
 * 		1. public boolean hashMoreElements()
 * 				for checking element is available or not
 * 
 * 		2. public E nextElement() throws NoSuchElementException
 * 				for retrieving object and moving cursor to next element
 * 	
 * - For retrieving Enumeration implementation object, 
 *   we must call factory method 
 *   	1. public Enumeration<E> elements()
 *   			- for retrieving Enumeration object on 
 *   				Vector and on Hashtable values
 *   
 *   	2. public Enumeration<E> keys()	 	
 *   			- for retrieving Enumeration object on
 *   				Hashtable keys
 *  
 * - For retrieving Enumeration on Collections framework collections
 *   we can a static factory in utility class Collections
 *   	3. public Enumeration<E> enumeration(Collection c)   
 *   	 
 */
public class Test22_Enumeration {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<>();
		v1.add("a");
		v1.add(5);
		v1.add("b");
		v1.add(6);
		v1.add("c");
		v1.add(7);
		System.out.println(v1);
		
		Enumeration<Object> e1 = v1.elements(); //legacy enumeration
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		System.out.println();
	//=============================================================
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put("a", 1);
		ht.put("b", 2);
		
		Enumeration<Object> e2 = ht.keys();
		while (e2.hasMoreElements()) {
				System.out.println(e2.nextElement());
		}
		System.out.println();
		
   //=============================================================
		Enumeration<Object> e3 = ht.elements();
		while (e3.hasMoreElements()) {
			System.out.print(e3.nextElement() + " ");
		}
		System.out.println();
  
  //=============================================================
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println();
		System.out.println(al);
		
		Enumeration<Object> e4 = Collections.enumeration(al);
		while (e4.hasMoreElements()) {
			System.out.print(e4.nextElement() + " ");
		}
		System.out.println();
		
  //=============================================================
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println();
		System.out.println(lhs);
		
		Enumeration<Object> e5 = Collections.enumeration(lhs);
		while (e5.hasMoreElements()) {
			System.out.print(e5.nextElement() + " ");			
		}
		System.out.println();
		
	}
}
