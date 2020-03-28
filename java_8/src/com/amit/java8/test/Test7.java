package com.amit.java8.test;

import java.util.Scanner;

public class Test7 {
	
	public void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print the table");
		int userInput = sc.nextInt();
		System.out.println("you have entered "+ userInput);
		for(int i=1;i<=10;i++) {
			System.out.println(userInput*i);
		}
	}
	public static void main(String[] args) {
	Test7 t=new Test7();
	t.m1();

	}

}
