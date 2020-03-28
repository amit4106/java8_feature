package com.amit.java8.exception;

public class ExceptionList {

	public static void main(String[] args) {
try {
		System.out.println(args[5]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);	
}
catch(IndexOutOfBoundsException e) {
System.out.println("hi");
}

}

}
