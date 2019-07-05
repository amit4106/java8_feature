package com.amit.java8.exception;

public class ExceptionTest {

	public void m1() throws InterruptedException{
		m2();
		
		System.out.println("m1");
	}
	public void m2() throws InterruptedException {
		Thread.sleep(-1000);
		System.out.println("m2");
		System.out.println(10/2);
	//throw new RuntimeException();
	}
	
	public static void main(String[] args) throws InterruptedException {
ExceptionTest et=new ExceptionTest();
et.m1();


	}

}
//NOTE: 1. In any method Exception (checked) is raised then we must handle that Exception  
//      using try, catch or you can pass that exception to the caller method using throws keyword.
//
//      2. But for unchecked Exception It is not mandatory to handle the Exception or pass that
//      Exception to the caller method using throws keyword. 