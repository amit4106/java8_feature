package com.amit.java8.inheritance;

public class InterfDemo implements Interf, Interf2 {

	@Override
	public void m1() {
	
		System.out.println("m1");
		
	}
	public static void main(String[] args) {
		Interf2 f=new InterfDemo();
		f.m1();
	}

}
