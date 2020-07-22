package com.book.dao;


import com.onlinebook.factory.BookFactory;
import com.onlinebook.model.Book;
import com.onlinebook.service.BookService;

public class Client {
	public static void main(String[] args) {
		Book book = new Book("Book013", "JVm", "Yashwant", "SChand", 300.0, 1);
		BookService srv = BookFactory.getServiceInstance();
		String result = srv.addBook(book);
		System.out.println(result);
	}
}
