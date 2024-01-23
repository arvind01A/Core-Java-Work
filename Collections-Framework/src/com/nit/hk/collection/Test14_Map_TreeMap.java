package com.nit.hk.collection;

import java.util.TreeMap;

public class Test14_Map_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Object, Object> tm1 = new TreeMap<>();
		
		tm1.put("a", 1);
		tm1.put("b", 2);
		tm1.put("c", 3);
		System.out.println(tm1);
		System.out.println();
		
		TreeMap<String, Object> tm2 = new TreeMap<>((s1, s2) -> s2.compareTo(s1));
		tm2.put("a",1);
		tm2.put("c", 2);
		tm2.put("b", 3);
		System.out.println(tm2);
		System.out.println();
		
		TreeMap<Sa, Object> tm3 = new TreeMap<>();
		tm3.put(new Sa(5, 6), 1);
		tm3.put(new Sa(7, 8), 2);
		tm3.put(new Sa(6, 4), 3);
		System.out.println(tm3);
		System.out.println();
		
		TreeMap<Sa, Object> tm4 = new TreeMap<>((s1, s2) -> s1.getY()-s2.getY());
		tm4.put(new Sa(5, 6), 1);
		tm4.put(new Sa(7, 8), 2);
		tm4.put(new Sa(6, 4), 3);
		System.out.println(tm4);
	}

}
