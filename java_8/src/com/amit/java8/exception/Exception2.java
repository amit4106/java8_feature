package com.amit.java8.exception;

public class Exception2 {
	int value=10;
	public int m1() {
		int value=m2();
		return value;
	}
	
	public int m2() {
		try {
			System.out.println(10/0);
		}
		catch(Exception e){
			value+=1;
			System.out.println(value);
			return value;
		}
		finally{
			value+=1;
			System.out.println(value);
			
		}
		return value;
	}
	public static void main(String [] args) {
		Exception2 ex=new Exception2();
		int value=ex.m1();
		System.out.println(value);
		
	}
}

//OUTPUT: 11, 12 11
