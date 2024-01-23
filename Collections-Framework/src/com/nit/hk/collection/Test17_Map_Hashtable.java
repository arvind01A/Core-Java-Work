package com.nit.hk.collection;

import java.util.Hashtable;

public class Test17_Map_Hashtable {

	public static void main(String[] args) {

		Hashtable<Object, Object> ht = new Hashtable<>();
		
		ht.put("a", 1);
		ht.put("b", 2);
		System.out.println(ht);
		ht.put(97, 3);
		ht.put(98, 4);
		System.out.println(ht);
		//ht.put(null, 5);
		//ht.put(99, null)

	}

}
