package com.amit.java8.test;

public class Test10 {

	public static void setAge(int a)throws Exception {
		if(a<0) {
throw new Exception("Age should be in positive"); 
		}
	}
	
	public static void main(String[] args){

		try {
		setAge(-20);
		}
		catch (Exception e) {
System.out.println(e.getMessage());
		}
		System.out.println("hello");
	}

}
