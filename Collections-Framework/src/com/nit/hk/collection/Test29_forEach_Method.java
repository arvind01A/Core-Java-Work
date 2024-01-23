package com.nit.hk.collection;

import java.util.ArrayList;

public class Test29_forEach_Method {
	public static void main(String[] args) {
					ArrayList<Object> al = new ArrayList<>();
					
					al.add("a1");
					al.add(51);
					al.add("b1");
					al.add(61);
					al.add("c1");
					al.add(71);
					
					//for(Object obj : al) {										//explicit iteration
					//	System.out.println(obj);
					//}
					
					//functional programming with OOP by using LE
					al.forEach( obj -> System.out.println(obj));			//implicit iteration
					System.out.println();
					
					al.forEach(obj -> {
						if(obj instanceof String s)
							System.out.println(s.toUpperCase());
						else 
							System.out.println(obj);
					});
	}
}
/*
interface Iterable<T> {

	public default void forEach(Iterable this, Consumer<T> c)	{
		Collection c = (Collection) this;
		Iterator<T> itr = c.iterator();
		while(itr.hasNext()){
			Object obj = itr.next();
			c.accept(obj);
		}
	}
}
*/