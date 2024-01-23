package com.nit.hk.collection;

import java.util.EnumMap;

public class Test13_Map_EnumMap {

	public static void main(String[] args) {
		
		EnumMap<FoodItem, Object> em = new EnumMap<>(FoodItem.class);
		
		em.put(FoodItem.IDLY, 30);
		em.put(FoodItem.BONDA, 50);
		em.put(FoodItem.PURI, 50);
		em.put(FoodItem.DOSA, 50);
		
		System.out.println(em);
	}

}
