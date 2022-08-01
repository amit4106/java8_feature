package com.amit.java8.practics;

public class Test2 {
	public static void main(String[] args) {
//		 B b = new B();
//		   System.out.println(b.i);
//		System.out.println(B.i);
	}
}
 class B extends A {
//	 static int i=20;
	static {
		
		i = --i - i--;
		System.out.println("child");
	}
	{
		i = ++i + i++;
		System.out.println("I-C");
	}
	
}


class A {
	static int i = 10;
	static {
		
		i = i-- - --i;
		System.out.println("parent");
	}

	{
		i = i++ + ++i;
		System.out.println("I-P");
	}
}

 
