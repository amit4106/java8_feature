package com.amit.java8.conclusion;

public class A {
	public static int a=m5();
	public static int b;
	public int c=m7();
	public int d;
	public void m10() {
		System.out.println("From A m10");
	}
	
	static {
		System.out.println(" parent static block -1");
		
	}
	static {
		System.out.println(" parent static block -2");
		
	}
	{
	System.out.println("parent Instance block -1");	
	}
	{
		System.out.println("parent Instance block -2");
	}
	public static int m5() {
		System.out.println("parent m5");
		return 30;
	}
	public int m7() {
		System.out.println("parent m7");
		return 40;
	}
	
	public A() {
		System.out.println("parent constructor");
		System.out.println(a + " " + b +" " +c + " " + d);
	}
	public static void m1() {
		System.out.println("parent m1");
	}
	public static void m2() {
		System.out.println("parent m2");
		
	}
	public void m3() {
		System.out.println("parent m3");
		
	}
	public void m4() {
		System.out.println("parent m4");
		
	}
	


}
