package com.amit.java8.fundamental;

public class PrimeNumber {

	public static boolean isPrimeNumber(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
boolean result =PrimeNumber.isPrimeNumber(2);
	System.out.println(result);
	}

}
