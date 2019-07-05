package com.amit.java8.test;

import java.util.Scanner;

public class Test2 {
	static int i=1;
	public static void mian(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number for table");
		
		int no=sc.nextInt();
		
		int value=no*i;
				
		for(int i=1;i<=10;i++) {
		System.out.println(value);	
		}
	}

}
