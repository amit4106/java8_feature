package com.book.dao;


import com.book.model.Book;
import com.book.services.BookServices;
import com.onlinebook.factory.BookFactory;

public class Client {
	public static void main(String[] args) {
		Book book = new Book("Book013", "JVm", "Yashwant", "SChand", 300.0, 1);
		BookServices srv = BookFactory.getServiceInstance();
		String result = srv.addBook(book);
		System.out.println(result);
	}
}
