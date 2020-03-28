package com.amit.java8.test;

import java.util.ArrayList;

public class Test9 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
	al.add(20);
	al.add(30);
	al.add(40);
	System.out.println(al);
	al.forEach(System.out::println);
	System.out.println();
	al.add(1, 25);
	al.forEach(System.out::println);
	}
}
