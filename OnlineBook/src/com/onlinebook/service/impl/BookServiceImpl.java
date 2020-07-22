package com.onlinebook.service.impl;

import java.util.List;

import com.onlinebook.constant.Message;
import com.onlinebook.factory.BookFactory;
import com.onlinebook.mapper.Mapper;
import com.onlinebook.model.Book;
import com.onlinebook.repository.BookRepository;
import com.onlinebook.response.Response;
import com.onlinebook.service.BookService;
import com.onlinebook.util.MessageBundle;

public class BookServiceImpl implements BookService {
	private BookRepository repo;
	private Mapper map;

	public BookServiceImpl() {
		this.repo = BookFactory.getRepositoryInstance();
		this.map=BookFactory.getMapperInstance();
	}

	@Override
	public String addBook(Book book) {
		Response res = repo.addBook(map.mapToBookEntity(book));
		if (res.getStatus().equals(Message.SUCCESS)) {
			return MessageBundle.getMessage(Message.BOOK_ADDED);
		} else {
			return MessageBundle.getMessage(Message.BOOK_NOT_ADDED);
		}
	}

	@Override
	public String addBook(List<Book> books) {
		Response response = repo.addBook(map.mapToBookEntity(books));
		if (response.getStatus().equals(Message.SUCCESS)) {
			return response.getMessage()+" "+MessageBundle.getMessage(Message.BOOK_ADDED);
			
		} else {
			return MessageBundle.getMessage(Message.BOOK_NOT_ADDED);
		}
		}

	@Override
	public String update(Book book) {
		Response response = repo.update(map.mapToBookEntity(book));
		String message = response.getMessage();
		return message;
	}

	@Override
	public String delete(String bookId) {
		Response response = repo.delete(bookId);
		String message = response.getMessage();
		return message;
	}

	@Override
	public Book getBookById(String bookId) {
		return map.mapToBook(repo.getBookById(bookId));
	}

	@Override
	public List<Book> getAllBooks() {
		return map.mapToBook(repo.getAllBooks());
	}

	@Override
	public List<Book> getBookByAuthor(String authorName) {
		return map.mapToBook(repo.getBookByAuthor(authorName));
		
	}

	@Override
	public List<Book> getBookByAuthorAndEdition(String author, String edtion) {
	 return map.mapToBook(repo.getBookByAuthorAndEdition(author, edtion));
	}

	@Override
	public List<Book> getBookByAuthorAndPublication(String author, String publication) {
		return map.mapToBook(repo.getBookByAuthorAndPublication(author, publication));
		 
	}

}
