package com.amit.java8.task;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test2 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("A ");
	al.add("B ");
	al.add("C ");
	al.add("D ");
	//al.forEach(System.out::print);
	java.util.Iterator<String> it = al.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}
}
}
