package com.amit.java8.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
	public static void main(String[] args) {
	
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//al.add("amit");
		al.remove(2);
		//System.out.println(al);
		//al.forEach(System.out::println);
		al.stream().forEach(System.out::println);
			
	}
	
	}
	
