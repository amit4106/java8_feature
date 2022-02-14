package com.amit.java8.test;

import java.io.IOException;

public class Test12 {

	public static void main(String[] args) {
		//int i=3,k;
		loop1:for (int i = 5; i <= 5; i--) {
			System.out.print("");
			if(i==0) break loop1;
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
 * ctrl + shift R to rename the method name.
 */
