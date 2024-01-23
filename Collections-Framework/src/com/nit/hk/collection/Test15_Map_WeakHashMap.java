package com.nit.hk.collection;

import java.util.WeakHashMap;

public class Test15_Map_WeakHashMap {

	public static void main(String[] args) {

		WeakHashMap<Object, Object> whm  = new WeakHashMap<>();
		
		Sa s1 = new Sa(5, 6);
		String s2 = new String("a");
		
		whm.put(s1, 1);
		whm.put(new Sa(6, 5), 2);
		
		whm.put(s2, 3);
		whm.put("b", 4);
		
		whm.put(15, 5);
		whm.put(500, 6);
		
		System.out.println(whm);
		System.gc();
		System.out.println(whm);

	}

}
