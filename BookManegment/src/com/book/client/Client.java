package com.book.client;

import com.services.BookServices;

public class Client {

	public static void main(String[] args) {
		
		BookServices bs = new BookServices();
		bs.addBook(true);
	}
}
