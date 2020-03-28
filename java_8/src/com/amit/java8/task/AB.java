package com.amit.java8.task;

public interface AB extends A  {
	
	
	public default void m1() {
		
System.out.println("AB interface m1");
	}
	
}
