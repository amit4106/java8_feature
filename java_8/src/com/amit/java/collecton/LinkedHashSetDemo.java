package com.amit.java.collecton;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> ld=new LinkedHashSet<>();
		
		//ld.add(null);
		
		ld.add(30);
		ld.add(10);
		ld.add(20);
		ld.add(30);
		
//		for(Integer i:ld) {
//			System.out.println(i);
//		}
		
//		ld.add(34);
//for(Object obj:ld) {
//	
//	System.out.println(obj);
//	}
//		ld.stream().forEach(System.out::println);
		
//		for(Iterator<Integer> i=ld.iterator();i.hasNext();) {
//			System.out.println(i.next());
//		}
		
		ld.forEach(System.out::println);
	}

}

// 1. Duplicate value is not allowed in LinkedHashSet but order is preserved.
// 2. Underlying data structure is (HashTable + DoublyLinkedList)

