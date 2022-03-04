package com.amit.java8.practics;

public class Test {
	static Integer i;
	public static void main(String[] args) {
		//System.out.println(args[0]+ " "+ args[1]+" "+args[2]);
		String s;
		//System.out.println(i);
		try {
			s = i.toString();
		} finally {
			try {
				int ii = Integer.parseInt(args[0]);
				
				System.out.println(ii);
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