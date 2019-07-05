package com.amit.java.collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40.23);
		al.add(45);
		al.add("amit");
		al.add("amit");
		al.add("amit");
		al.add("amit");
		al.add("amit");
		System.out.println("&: "+al.add("amit"));
		al.add("amit");
		
		al.add(3,100);
//		for(int i=0;i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
//		int i=0;
//	while(i<al.size()) {
//		
//		System.out.println(al.get(i++));
		//i++;
		
	//}
//		
//		Iterator iterator = al.iterator();
//		while(iterator.hasNext()) {
//		System.out.println(iterator.next());	
//		}
	ListIterator listIterator = al.listIterator();

	while(listIterator.hasNext()) {
		//listIterator.remove();
//al.add(10);
	System.out.println(listIterator.next());	
	}
//	
//		for(Object value :al) {
//			System.out.println(value);
		//}
	//al.stream().forEach(System.out::println);;
	
	//al.forEach(System.out::println);
	
//Enumeration enumeration = Collections.enumeration(al);
//
//while(enumeration.hasMoreElements()) {
//	System.out.println(enumeration.nextElement());
//}
}

}


