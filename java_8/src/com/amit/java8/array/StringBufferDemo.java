package com.amit.java8.array;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb= new StringBuffer("cd");
		
		sb.append("ab");
		
		sb.trimToSize();
		
		System.out.println(sb.capacity());
	}

}
