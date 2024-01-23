package com.nit.hk.collection;

public class Test01_NITCollection {

	public static void main(String[] args) {
		
		NITArrayList col=new NITArrayList();
		
		System.out.println("capacity      :"+col.capacity());
		System.out.println("size              :"+col.size());
		System.out.println("eles             :"+col);
		
		col.add("a");
		col.add("b");
		col.add(5);
		col.add(6.7);;
		col.add('p');
		col.add(null);
		col.add(true);
		col.add(new Ex(5,6));
		col.add("a");
		col.add(5);
		
		System.out.println();
		System.out.println("capacity         :"+col.capacity());
		System.out.println("size                 :"+col.size());
		System.out.println("eles                :"+col);
		System.out.println();
		
		col.add(new Ex(7,8));
		System.out.println("capacity          :"+col.capacity());
		System.out.println("size                  :"+col.size());
		System.out.println("eles                 :"+col);
		System.out.println();
		
		System.out.println(col.contains("a"));
		System.out.println(col.contains("A"));
		System.out.println(col.contains(new String("a")));
		System.out.println(col.contains(5));
		
		System.out.println(col.contains(new Integer(5)));
		System.out.println(col.contains(new Ex(5,6)));
		System.out.println(col.contains(new Ex(9,6)));
		System.out.println(col.contains(null));
		System.out.println();
		
		System.out.println(col);
		System.out.println(col.indexOf("a"));
		System.out.println(col.indexOf(5));
		System.out.println(col.indexOf(new Ex(5,6)));
		System.out.println(col.indexOf("A"));
		System.out.println(col.indexOf(6.7));
		System.out.println(col.indexOf('p'));
		System.out.println(col.indexOf(null));
		System.out.println(col.indexOf(true));
		System.out.println();
		System.out.println(col);
		System.out.println("capacity          :"+col.capacity());
		System.out.println("size                  :"+col.size());
		System.out.println(col.lastIndexOf("a"));
		
		System.out.println();
		System.out.println(col);
		System.out.println("retrieving  :"+ col.get(2));
		
		System.out.println();
		System.out.println(col);
		System.out.println("remove      :"+col.remove(2));
		System.out.println(col);
		System.out.println();
		System.out.println(col);
		System.out.println(col.remove(null));
		System.out.println(col);
		System.out.println();
		
		//insertion object
		System.out.println("capacity          :"+col.capacity());
		System.out.println("size                  :"+col.size());
		System.out.println("eles                 :"+col);
		System.out.println();
		col.add(7 , null);
		System.out.println("capacity          :"+col.capacity());
		System.out.println("size                  :"+col.size());
		System.out.println("eles                 :"+col);
		System.out.println();
		
		System.out.println("replace           :"+col.set(3,"z"));
		
		System.out.println("capacity          :"+col.capacity());
		System.out.println("size                  :"+col.size());
		System.out.println("eles                 :"+col);
		System.out.println();
	}

}
