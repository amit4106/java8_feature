package com.amit.java8.exception;

public class ExceptionList {

	public static void main(String[] args) {
try {
		System.out.println(args[0]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("");	
}
catch(IndexOutOfBoundsException e) {

}

}

}
