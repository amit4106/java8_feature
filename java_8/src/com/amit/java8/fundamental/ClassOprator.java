package com.amit.java8.fundamental;

public class ClassOprator {
	int a = 10;
	int b = 20;

	public void m1() {
		// System.out.println(a++ +a++ + ++a);
		// System.out.println(++a + ++a + a++);
//System.out.println(a++ + a +a-- -a-- + a++);
		System.out.println(10+10);
		System.out.println("" +10+10);
		System.out.println(10+10+""+20);
		//System.out.println(b+=1);
		//b+=1; b++; b=b+1;
		System.out.println(b);
		

	}

	public static void main(String[] args) {
		ClassOprator co = new ClassOprator();
		co.m1();
	}
}
