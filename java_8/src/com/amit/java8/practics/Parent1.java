package com.amit.java8.practics;

public class Parent1 {
	
public static void main(String[] args) {

	StringBuilder sb=new StringBuilder();
	sb.append("abc").insert(1, 12).insert(3, "xyz");
	System.out.println(sb);
}
}
