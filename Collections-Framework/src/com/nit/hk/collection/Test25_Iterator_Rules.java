package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test25_Iterator_Rules {
	public static void main(String[] args) {
				ArrayList<Object> al = new ArrayList<>();
		
				Iterator<Object> itr = al.iterator();
	//Rule #1: We can not call next() method on 
												//empty collection and on empty location, 
												//it leads RE: NSEE
				  //System.out.println(itr.next()); 		//RE :  java.util.NoSuchElementException
				
				al.add("a");
				Iterator<Object> itr2  = al.iterator();
				System.out.println(itr2.next());	//a
				//System.out.println(itr2.next());		//RE: java.util.NoSuchElementException
				
	//Rule #2: after modifying collection, we can not continue 
					//the same cursor object, it leads RE: CME
				al.add(5);
				//System.out.println(itr2.next());	//RE: java.util.ConcurrentModificationException
				
	//Rule #3: without calling next() we cannot  call remove()
				//also can not call more than once per next() method call
				Iterator<Object> itr3 = al.iterator();
				
				itr3.remove();		//RE: java.lang.IllegalStateException
				itr3.next();
				itr3.remove();
				//itr3.remove();		//RE: ISE
	}
}
