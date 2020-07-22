package com.book.client;

import com.book.model.Book;
import com.book.services.BookServices;

public class Client {

	public static void main(String[] args) {

		BookServices bs = new BookServices();
		Book book = new Book(29, "The War", "John", "TheFort", 263.40, "Vol -03");
		int count = bs.addBook(book);
		System.out.println(count);
		
		
	}
}
