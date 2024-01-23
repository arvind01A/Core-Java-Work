package com.nit.hk.collection;

public class Test02_NITMap {

	public static void main(String[] args) {
		NITMap map = new NITMap();
		
		System.out.println("size                 :"+map.size());
		System.out.println();
		map.put("a", 1);
		map.put("b", 2);
		map.put(5, 3);
		map.put(6.7, 4);
		map.put('p', 5);
		map.put(true, 6);
		map.put(null, 7);
		map.put("Hari", "name");
		System.out.println("size                 :"+map.size());
		System.out.println(map);
		System.out.println();
		
		System.out.println("searching key    "+map.search(true));
	}

}
