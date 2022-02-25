package com.amit.java8.practics;

public class Test {
	static Integer i;
	public static void main(String[] args) {
		String s;
		try {
			s = i.toString();
		} finally {
			try {
				int ii = Integer.parseInt(args[0]);
			} catch (NumberFormatException E) {
				System.out.print("NumberFormat");
			} finally {
				System.out.print("Fi ");
			}
			System.out.print("ne");
		}
	}
}

//ctrl + 1 to store the value of variable.