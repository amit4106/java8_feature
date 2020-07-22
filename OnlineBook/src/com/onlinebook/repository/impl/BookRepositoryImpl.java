package com.onlinebook.repository.impl;

import java.util.List;

import com.onlinebook.entity.BookEntity;
import com.onlinebook.factory.BookFactory;
import com.onlinebook.repository.BookRepository;
import com.onlinebook.response.Response;
import com.onlinebook.template.JdbcTemplate;

public class BookRepositoryImpl implements BookRepository {
	private JdbcTemplate template;

	public BookRepositoryImpl() {
		this.template = BookFactory.getJdbcTemplateInstance();
	}

	/**
	 * 1. establish connection between DAO and database
	 * 
	 */
	@Override
	public Response addBook(BookEntity book) {
		Response res = template.save(book);

		return res;
	}

	@Override
	public Response addBook(List<BookEntity> books) {
		Response response = template.save(books);
		return response;
	}

	@Override
	public Response update(BookEntity book) {
		Response res = template.update(book);
		return res;
	}
	
	public Response delete(String bookId) {
		Response response = template.delete(bookId);
		return response;
	}

	@Override
	public BookEntity getBookById(String bookId) {
		return template.getBookById(bookId);
	}

	@Override
	public List<BookEntity> getAllBooks() {
		return template.getAllBooks();
	}

	@Override
	public List<BookEntity> getBookByAuthor(String authorName) {
		return template.getBookByAuthor(authorName);
		 
	}

	@Override
	public List<BookEntity> getBookByAuthorAndEdition(String author, String edtion) {
		 
		return null;
	}

	@Override
	public List<BookEntity> getBookByAuthorAndPublication(String author, String publication) {
		return template.getBookByAuthorAndPublication(author, publication);
	}

		

}
