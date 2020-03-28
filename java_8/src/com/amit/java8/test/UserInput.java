package com.amit.java8.test;

import java.util.Scanner;

public class UserInput {
	public static void m1() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number to print the table");

		int userInput=sc.nextInt();

				for(int i=1; i<=10; i++) {
					int result=i*userInput;
			System.out.print(result +". ");
		}
	}

	public static void main(String[] args) {
m1();
	}

}
