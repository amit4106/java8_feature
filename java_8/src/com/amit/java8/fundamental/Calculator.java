package com.amit.java8.fundamental;

import java.util.Scanner;

public class Calculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int substract(int e, int f) {
		
		int g = e - f;
//		System.out.println(g);
		return g;
	}

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number");
      int input1=   sc.nextInt();
      System.out.println("Enter secont number");
   int input2=   sc.nextInt();
		Calculator cal = new Calculator();
		System.out.println("Choose 1 for Adding and Choose 2 for Subtraction");
	int action=	sc.nextInt();
	if(action==1) {
		int sum = cal.add(input1, input2);
		System.out.println(sum);	
		
	}
	
	if(action==2) {
		int result = cal.substract(input1, input2);
		System.out.println(result);
	}
		
		

	}
}
