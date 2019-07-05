package com.amit.java8.array;

public class StringInterview {

	
	public static void main(String[] args) {

		String name="my name is khan";
		
		String[] split = name.split(" ");
		for(int i=split.length-1; i>=0; i--) {
			System.out.print(split[i]+ " ");
			
		} 
		System.out.println();
		String s="java";
		for(int i=s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
			
		}
		
	}

}
