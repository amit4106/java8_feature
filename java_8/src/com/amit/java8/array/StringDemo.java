package com.amit.java8.array;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1=new String("amit");
		String s2="amit";
		
		String s3=new String("amit");
		String s4="amit";
			   //s4="mak";
		String s5="mak";
		s2="hello"  +"welcome";
		
		char [] ch= {'a', 'm', 'i' ,'t'};
		
		String s6=new String(ch);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s3);
		
		System.out.println(s2==s4);
		
		System.out.println(s1.equals(s6));
		
		String s7="Java";
		s7.concat("world");
		System.out.println(s7);
		
		//'==' operator check based on references (address) and ".equals" method checks based on content.
		// e.g -"amit" is content
		// we can create String object in two ways 1. By using new operator 2. By using literals.
		// e.g new operator  -String s3=new String("amit");
		// e.g literals -String s4="amit";
	}

}
