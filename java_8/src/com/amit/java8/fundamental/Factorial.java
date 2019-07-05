package com.amit.java8.fundamental;

import java.util.*;

public class Factorial {

	public int factorial(int n) {
		int temp = 1;

		for (int i = 1; i <= n; i++) {
			temp = temp * i;
		}
		return temp;
	}
	public static void main(String [] args) {
		Factorial fact=new Factorial();
		int result=fact.factorial(7);
		System.out.println(result);
	}

}
