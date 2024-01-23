package com.nit.hk.collection;

import java.util.HashMap;

public class Test11_Map_HashMap {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
		
		System.out.println("size     :"+hm.size());
		System.out.println(hm);
		System.out.println();
		
		System.out.print(hm.put("a", 5));		System.out.println("\t\t"+hm);
		System.out.print(hm.put("b", 6));		System.out.println("\t\t"+hm);
		System.out.print(hm.put("c", 7));		System.out.println("\t\t"+hm);
		System.out.print(hm.put(97, "a"));		System.out.println("\t\t"+hm);
		
		System.out.println();
		System.out.println("size     :"+hm.size());
		
	}

}
