package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/*
 * - Enumeration method names are large
 * - Enumeration can not remove elements from collection
 * 
 * To solve above two problems Iterator is defined
 * 	
 * - Iterator is also Cursor object, it is collections framework cursor object
 * available from Java 1.2v
 * 
 * - Iterator is also interface, to obtain its implementation classes
 *  object, we have factory method in Collection interface.
 * 		public Iterator<E> iterator()
 * 
 * - Iterator<E> has below 3 methods
 * 		1. public boolean 	hasNext()
 * 		2. public E 		next() 
 * 		3. public E 		remove() 
 *  
 * - We can use Iterator on both legacy and CsF collections
 *   by using the same factory method iterator()   
 */
public class Test23_Iterator {
	public static void main(String[] args) {
		Iterator<Object> itr;
		
		Vector<Object> v1 = new Vector<>();
		v1.add("a");
		v1.add(5);
		v1.add("b");
		v1.add(6);
		v1.add("c");
		v1.add(7);
		
		itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
 //======================================================
		ArrayList<Object> al = new ArrayList<>() ;
		al.add("a2");
		al.add(52);
		al.add("b2");
		al.add(62);
		al.add("c2");
		al.add(72);
		
		itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

//======================================================
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		lhm.put("a3", 1);
		lhm.put(53, 2);
		lhm.put("b3", 3);
		lhm.put(63, 4);
		lhm.put("c3", 5);
		lhm.put(73, 6);
		
		//itr = lhm.iterator();		//CE:
		Set<Object> keys = lhm.keySet();
		itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		Collection<Object> col = lhm.values();
		itr = col.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		Set<Map.Entry<Object, Object>> entrySet = lhm.entrySet();
		Iterator<Map.Entry<Object, Object>> itr2 = entrySet.iterator();
		while (itr2.hasNext()) {
			Map.Entry<Object,Object> entry = itr2.next();
			System.out.println();
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(" -> " + key + " " + value);
		}
		System.out.println();
	}
}
