package com.amit.java8.fundamental;

public class Divisible {
public static boolean isDivisibleBy3(int n) {
	return n % 3 ==0;
}
	
	public static void main(String[] args) {
		boolean result =Divisible.isDivisibleBy3(10);
		System.out.println(result);

	}

}
