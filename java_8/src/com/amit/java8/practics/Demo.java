package com.amit.java8.practics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		List<String> slist = Arrays.asList("Grapes", "Mango", "Apples", "Oranges", "Bananas");
		List<Integer> ilist = Arrays.asList(3, 5, 2, 8, 9, 1, 7);
		
		Set<String> s=new TreeSet<>();
		s.addAll(slist);
		Iterator<String> iterator=s.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println();
		}
	}

	
}
