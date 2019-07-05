package com.amit.java8.conclusion;

public class Main extends B{
	static {
		System.out.println("From Main");
	}
	{
		System.out.println("main instance");
	}
	public void m10() {
		System.out.println("from main m10");
	}

	public static void main(String [] args) {
		System.out.println("Before ");
		A a=new Main();
		a.m10();
		System.out.println("After ");
		
	}
}
