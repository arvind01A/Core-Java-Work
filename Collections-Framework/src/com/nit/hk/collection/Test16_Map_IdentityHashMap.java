package com.nit.hk.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Test16_Map_IdentityHashMap {

	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(new Sa(5, 6), 1);
		hm.put(new Sa(4, 3), 2);
		hm.put(new Sa(4, 3), 3);
		hm.put(new Sa(7, 8), 4);
		System.out.println(hm);
		
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		ihm.put(new Sa(5, 6), 1);
		ihm.put(new Sa(4, 3), 2);
		ihm.put(new Sa(4, 3), 3);
		ihm.put(new Sa(7, 8), 4);
		
		Sa s5 = new Sa(10, 11);
		ihm.put(s5, 5);
		ihm.put(s5, 6);
		
		System.out.println(ihm);
	}

}
