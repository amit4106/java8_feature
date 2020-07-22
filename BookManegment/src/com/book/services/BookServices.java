package com.book.services;


import java.util.List;

import com.book.dao.BookDao;
import com.book.model.Book;

public class BookServices {

	public int addBook(Book book) {
		BookDao dao=new BookDao();
		return dao.addBook(book);
		
	}

	public boolean verifyUser(String userName, String password) {

		return false;
	}

	public int deleteBook(int book) {
		BookDao dao=new BookDao();
		return dao.deleteBook(book);
	}

	public int updateBook(int i) {
		return 0;
	}

	public List<Book> bookByAuthor(String authorName) {
		return null;
	}

	public List<Book> bookByName(String s) {
		return null;
	}

	public List<Book> allBooks() {
		return null;
	}

	public List<Book> bookByCost(Double d) {
		return null;
	}
}
