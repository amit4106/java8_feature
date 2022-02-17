package com.amit.java8.exception;

public class Book {

	public String find(String name) {//throws BookNotFoundException {
		if (name.equals("java")){
	return name;		
		}
		else {
			throw new BookNotFoundException();
		}
	}
	public static void main(String[] args) {

	}

}
