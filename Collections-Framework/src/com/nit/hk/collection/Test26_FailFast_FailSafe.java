package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test26_FailFast_FailSafe {
	public static void main(String[] args) {
					ArrayList<Object> al = new ArrayList<>();
					al.add("a");
					al.add(5);
					al.add("b");
					al.add(6);
					al.add("c");
					al.add(7);
					System.out.println(al);
					
					Iterator<Object> itr = al.iterator();			// fail fast cursor
					System.out.println(itr.next());
					System.out.println(itr.next());
					System.out.println(itr.next());
						
							al.add("d");
							System.out.println(al);
				    
				   //System.out.println(itr.next());	//RE: java.util.ConcurrentModificationException
				System.out.println();			
//========================================================
					CopyOnWriteArrayList<Object> cal = new CopyOnWriteArrayList<>();
					cal.add("a1");
					cal.add(51);
					cal.add("b1");
					cal.add(61);
					
					Iterator<Object> itr2 = cal.iterator(); 	// fail safe
					System.out.println(itr2.next());
					System.out.println(itr2.next());
					
					cal.add("c1");
					cal.add(71);
					
					System.out.println(itr2.next());
	}
}
