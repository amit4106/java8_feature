package com.amit.java8.exception;

public class Exception3 {
	
	public void m1() {
		throw new ArithmeticException("/ by zero");
		//System.out.println(10/0);
		
		}
	public static void main(String[] args) {
		Exception3 ex=new Exception3();
		ex.m1();
	}
}
