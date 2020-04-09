package com.book.dao;

import com.book.dao.template.JDBCTemplate;
import com.book.model.Book;

public class BookDao {
	
public int addBook(Book book) {
	JDBCTemplate template= new JDBCTemplate();
	return template.save(book);
	
	}
	
}
