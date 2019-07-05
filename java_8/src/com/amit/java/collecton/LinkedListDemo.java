package com.amit.java.collecton;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> ld=new LinkedList<>();
		
		ld.add(10);
		ld.add(20);
		ld.add(30);
		ld.add(40);
		ld.add(50);
		//for(int i=0; i<ld.size(); i++) {
			//System.out.println(ld.get(i));
		int i=0;
		while (i<ld.size()) {
			System.out.println(ld.get(i++));
		}
		
	}

}
