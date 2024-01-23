package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test24_Iterator_Remove {
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
		//itr.remove();		//RE : ISE
		itr.next();
		itr.remove();		// no RE: first object is removed
		//itr.remove();
		
		System.out.println(al);
		System.out.println();
		
		while (itr.hasNext()) {
			System.out.println(al);
			Object obj = itr.next();
			
			//itr.remove();		// All elements are remove
		/*	if(obj instanceof Integer)
				itr.remove();		// remove only Integer objects
			*/
			if(obj instanceof String)
				itr.remove();  		// remove only String objects
		}
		System.out.println();
		System.out.println(al);
		itr.remove();
		System.out.println(al);
	}
}
