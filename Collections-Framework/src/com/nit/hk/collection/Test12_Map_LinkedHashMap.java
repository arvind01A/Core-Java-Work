package com.nit.hk.collection;

import java.util.LinkedHashMap;

public class Test12_Map_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		
		System.out.println("size     :"+lhm.size());
		System.out.println(lhm);
		System.out.println();
		
		System.out.print(lhm.put("a", 5));		System.out.println("\t\t"+lhm);
		System.out.print(lhm.put("b", 6));		System.out.println("\t\t"+lhm);
		System.out.print(lhm.put("c", 7));		System.out.println("\t\t"+lhm);
		System.out.print(lhm.put(97, "a"));		System.out.println("\t\t"+lhm);
		
		System.out.println();
		System.out.println("size     :"+lhm.size());
		
	}

}
