package com.java11;

import java.util.List;

public class Java11Features {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,20,30,40,50);
//		list.add(60);
		System.out.println(list);
		
		List<Integer> list1=List.copyOf(list);
//		list1.add(60);
		System.out.println(list1);
		
	}

}
