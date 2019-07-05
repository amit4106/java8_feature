package com.amit.java8.fundamental;

public class NumberSystem {
	
	// check given number is prime no or not.
	//  6 if(6%2!=0) 6%3!=0 6%4!=0 6%5!=0
	public static boolean  isPrimeNumber(int n) {
		if(n<0 || n==1) {
		 throw new IllegalArgumentException("Please provide valid input");
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	// write a program to check given number is divisible by 2,3,4,5,6,7,8,9,10,11
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(1));
	}
}
