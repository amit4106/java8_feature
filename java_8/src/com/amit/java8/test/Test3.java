package com.amit.java8.test;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter First Numbers to perform Division");
int firstNum=sc.nextInt();
System.out.println("Please enter second number");
int secondNum=sc.nextInt();
float result=firstNum/secondNum;
System.out.println("Division of "+ firstNum + " And "+ secondNum+ " is " +result);
	}
}