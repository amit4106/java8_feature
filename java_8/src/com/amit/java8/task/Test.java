package com.amit.java8.task;

public class Test {

	private static void type(float f) {
		System.out.println("float");
	}

	public static void main(String[] args) {
StringBuilder sb=new StringBuilder("ABCDEF");
sb.reverse().reverse().append(12);
sb.setLength(4);
System.out.println(sb);
	}
}
