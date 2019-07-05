package com.amit.java.collecton;

import java.util.HashSet;

public class SetDemo {

	public static void main(String ...rg) {

		@SuppressWarnings("rawtypes")
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(10);
		
		for(Object obj : hs ) {
			
			System.out.println(obj);
		}
		
		HashSet<Integer> hs2=new HashSet<>();
		System.out.println(hs2.add(10));
		hs2.add(null);
		System.out.println(hs2.add(10));
		hs2.add(10);
		hs2.add(20);
		hs2.add(10);
		
		for(Integer  i: hs2) {
			System.out.println(i);
		}
		
	}
}
// 1. HashSet not allow duplicate value 
// 2. In HashSet order is not preserved
// 3. HashSet is build on HashTable data structure (Underlying data structure is HashTable ) 

