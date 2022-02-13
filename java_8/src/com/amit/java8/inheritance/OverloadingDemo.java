package com.amit.java8.inheritance;

public class OverloadingDemo {
	public void add() {
		System.out.println("No Arguments");
	}
	public void m1(int a) {
		System.out.println("One Arguments");
	}
	public int add1(int a, float b) {  // to rename the method name -ctrl + shift+ r
		return 1;
	}
	public void m1(float a, int b) {
		
	}
	public static void main(String [] args) {
		OverloadingDemo od=new OverloadingDemo();
		od.add1(10,10f);
		//od.m1(10,10,10,10,10,10,10,10);
				
	}
	
	public double m1(int...a ) {
		return 0;
	}
	
	

}
