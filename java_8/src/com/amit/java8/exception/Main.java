package com.amit.java8.exception;

public class Main {
	
	public static void main(String[] args) {//throws BookNotFoundException {
		Book b=new Book();
		try {
			String find=b.find("Java");
			System.out.println(find);
		} catch (BookNotFoundException e) {
		System.out.println("Exception occur while finding book");
		}
	//b.find("TheJungle");
	}

}
