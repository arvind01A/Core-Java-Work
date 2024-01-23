package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * - Iterator is forward only cursor
 * - It allows to retrieve objects from 0-size()-1 locations
 * - It does not allows us to reuse it for retrieving elements in backward
 * 
 * - For retrieving elements bidirectional we must use ListIterator
 * 
 * - ListIterator is also cursor object, available from java 1.2v
 * - It is a sub interface of Iterator
 * - It is used for retrieving objects in forward and backward directions
 * 
 * - In addition to the methods inherited from Iterator
 *   ListIterator provided below new methods
 *   	1. public boolean 	hasPrevious()
 *   	2. public E			previous()
 *   
 *   	3. public void		add(E e)
 *   	4. public void		set(E e)
 *     
 * 
 */
public class Test27_ListIterator {
	public static void main(String[] args) {
					ArrayList<Object> al = new ArrayList<>();
					
					al.add("a");
					al.add(5);
					al.add("b");
					al.add(6);
					al.add("c");
					al.add(7);
					System.out.println(al);
					
					Iterator<Object> itr = al.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
					System.out.println();
					
					ListIterator<Object> litr = al.listIterator();
					while(itr.hasNext()) {
							Object obj = itr.next();
							System.out.println(obj);
					}
					System.out.println();
					
					while(litr.hasPrevious()) {
						Object obj = litr.previous();
						System.out.println(obj);
					}
					System.out.println();
					
					while(litr.hasNext()) {
						Object obj = litr.next();
						
						if(obj instanceof String s)
							litr.set(s.toUpperCase()); 	//replacing
						
						else if(obj instanceof Integer)
							litr.add(20);		//inserting
					}
					System.out.println(al);
	}
}
