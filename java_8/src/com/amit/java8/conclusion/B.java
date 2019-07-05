package com.amit.java8.conclusion;

public class B extends A {
	public static int a=m5();
	public static int b;
	public int c=m6();
	public int d;
	public void m10() {
		System.out.println("From B m10");
	}
	
	static {
		System.out.println("static block -1");
		
	}
	static {
		System.out.println("static block -2");
		
	}
	{
	System.out.println("Instance block -1");	
	}
	{
		System.out.println("Instance block -2");
	}
	public static int m5() {
		System.out.println("m5");
		return 10;
	}
	public int m6() {
		System.out.println("m6");
		return 20;
	}
	
	public B() {
		System.out.println("constructor");
		System.out.println(a + " " + b +" " +c + " " + d);
	}
	public static void m1() {
		System.out.println("m1");
	}
	public static void m2() {
		System.out.println("m2");
		
	}
	public void m3() {
		System.out.println("m3");
		
	}
	public void m4() {
		System.out.println("m4");
		
	}
	

}
