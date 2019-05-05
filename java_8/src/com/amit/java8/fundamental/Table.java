package com.amit.java8.fundamental;

import java.util.Scanner;

public class Table {

	public void printTable(int n) {
		for(int i=1;i<=10;i++)
			System.out.println(n*i);
		
}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for table");
		int input=sc.nextInt();
		System.out.println("You Entered no "+ input);
		Table tb=new Table();
		tb.printTable(input);
		
	}
}
