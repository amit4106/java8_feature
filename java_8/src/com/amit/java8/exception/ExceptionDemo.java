package com.amit.java8.exception;

import java.io.IOException;

public class ExceptionDemo {
	
	public void m1(){
	int a=m2();
	System.out.println(a);
	}
	public int m2() {
		try {
		System.out.println(10/0);
		System.out.println("hello2");
		return 10;
	}
		//System.out.println(""); we cannot use any statement between try and catch block.
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception");
			//System.exit(0); this statement used to terminate the program explicitly 
			return 20;
		}
		//System.out.println("");
		catch(Exception e) {
			System.out.println("Exception occur");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			return 30;
		}
		finally{
			System.out.println("finally block");
			//return 40;
		}
	}	
	public static void main(String [] args) {
	ExceptionDemo ed=new ExceptionDemo();
	ed.m1();
	}

}
