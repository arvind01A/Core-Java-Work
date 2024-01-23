package com.nit.hk.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * - We can create collection object in three ways
 * 	1. by using new kw and constructor
 * 	2. by using factory method Arrays.asList(E...)
 * 	3. by using factory methods 
 *           List.of(E...), Set.of(E...) and Map.of(Map.Entry...)
 *                     
 * 1.
 * - In first approach 
 * 		the collection can be modifiable
 *   	means we can add more objects and we can remove existing objects
 *   
 * - in second and third approaches
 *      the collection is immutable/unmodifiable
 *      means we can not add or remove objects
 *      if we try we will get exception: java.lang.UnsupportedOperationException
 *   
 * 2.   
 * - In first approach null is allowed
 *   in second and third approaches null is not allowed it leads RE: NPE
 *  
 * 3.  
 * - in second and third approaches duplicates are not allowed in Set and Map
 *   it leads to RE: IllegalArgumentException
 * 
 */
public class Test20_DiffWaysOfCreatingCollectionAndMap {
		public static void main(String[] args) {
			 //Approach #1: by using new kw and constructor, 
			//then initialize it by using add() and put() methods
				List<Object> list = new ArrayList<>();
				list.add("a");
				list.add(5);
				list.add(null);
				list.add(new Ex(5, 6));
				list.add("a");
				System.out.println("list:	"+list);
				
				Set<Object> set = new LinkedHashSet<>();
				set.add("a");
				set.add(5);
				set.add(null);
				set.add(new Ex(5, 6));
				set.add("a");
				System.out.println("set : "+ set);

				Map<Object, Object> map = new LinkedHashMap<>();
				map.put("a", 1);
				map.put(5, 2);
				map.put(null, 3);
				map.put(new Ex(5, 6), 4);
				map.put("a", 5);
				System.out.println("map : "+ map);
				System.out.println();
				
				//Approach #2: by using Arrays.asList(E... e) method
				List<Object> list2 = Arrays.asList("a", 5, null, new Ex(5,6), "a");
				System.out.println("list2: "+ list2);
				
				Set<Object> set2   = new LinkedHashSet<>(list2);
				System.out.println("set2 : " + set2);
				System.out.println();
				
				//Approach #3: by using Java 9v 
				//	List.of(E...), Set.of(E...), Map.of(Map.Entry...)
					
					//List<Object> list3 = List.of("a", 5, null, new Ex(5,6), "a");
					//Set<Object>  set3  = Set.of("a", 5, null, new Ex(5,6), "a");
					//Map<Object, Integer> map3 = Map.of("a",1 , 5,2 , null,3 , new Ex(5,6),4 , "a",5);
				
				List<Object> list3 = List.of("a", 5, new Ex(5,6), "a");
				//Set<Object>  set3  = Set.of("a", 5, new Ex(5,6), "a");
				Set<Object>  set3  = Set.of("a", 5, new Ex(5,6));
				//Map<Object, Integer> map3 = Map.of("a",1 , 5,null , new Ex(5,6),4 , "a",5);
				//Map<Object, Integer> map3 = Map.of("a",1 , 5,2 , new Ex(5,6),3 , "a",5);
				Map<Object, Integer> map3 = Map.of("a",1 , 5,2 , new Ex(5,6),2 );
				
				System.out.println(list3);
				System.out.println(set3);
				System.out.println(map3);
				
				System.out.println();
				
				list.add("x");
				set.add("x");
				map.put("x", 6);
				
				//add and remove operations are allowed	
				System.out.println(list);
				System.out.println(set);
				System.out.println(map);
				System.out.println();
				
				list.remove("a");
				set.remove("a");
				map.remove("a");
				
				System.out.println(list);
				System.out.println(set);
				System.out.println(map);
				
				//list2.add("x");	//RE: USOE
				list2.remove("x"); //no exception, because "x" is not available
				//list2.remove("a");//RE: USOE
				
				//list3.add("x");
				//list3.remove("x"); //RE: even though "x" is not available

		}
}
