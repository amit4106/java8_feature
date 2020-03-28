package com.amit.java.collecton;

import java.util.ArrayList;

public class ALMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		//al.add(1,60);
		//System.out.println(al);
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);
		al2.addAll(al);
		//System.out.println(al2.isEmpty());
		
		//al2.remove(1);
		//System.out.println(al2); //[70, 90, 100, 10, 60, 20, 30, 40, 50]
		//Predicate<Integer> pd=(e)->{return al2.remove(e);};
		//al2.removeAll(al);
		//al2.remove(10);
		//al2.removeIf(pd);
		al2.retainAll(al);
		System.out.println(al2);
		
	}
}
