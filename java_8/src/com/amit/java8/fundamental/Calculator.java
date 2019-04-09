package com.amit.java8.fundamental;

public class Calculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	};

	public int substract(int e, int f) {
		int g = e - f;
		return g;
	};

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		int sum = cal.add(10, 20);
		System.out.println(sum);
		Calculator cal1 = new Calculator();
		int sub = cal1.substract(50, 10);
		System.out.println(sub);

	}
}
