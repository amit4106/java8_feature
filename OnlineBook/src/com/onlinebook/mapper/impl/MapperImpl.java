package com.onlinebook.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import com.onlinebook.entity.BookEntity;
import com.onlinebook.mapper.Mapper;
import com.onlinebook.model.Book;

public class MapperImpl implements Mapper {
	

	@Override
	public BookEntity mapToBookEntity(Book book) {
		BookEntity book1= new BookEntity();
		book1.setBookId(book.getBookId());
		book1.setBookName(book.getBookName());
		book1.setAuthorName(book.getAuthorName());
		book1.setPublication(book.getPublication());
		book1.setCost(book.getCost());
		book1.setEdition(book.getEdition());
		return book1;
	}

	@Override
	public Book mapToBook(BookEntity book) {
		Book book1= new Book();
		book1.setBookId(book.getBookId());
		book1.setBookName(book.getBookName());
		book1.setAuthorName(book.getAuthorName());
		book1.setPublication(book.getPublication());
		book1.setCost(book.getCost());
		book1.setEdition(book.getEdition());
		return book1;
	}

	@Override
	public List<BookEntity> mapToBookEntity(List<Book> books) {
		List<BookEntity> listOfBooks=new ArrayList<>();
		for(Book book: books ) {
			BookEntity book1=new BookEntity();
			book1.setBookId(book.getBookId());
			book1.setBookName(book.getBookName());
			book1.setAuthorName(book.getAuthorName());
			book1.setPublication(book.getPublication());
			book1.setCost(book.getCost());
			book1.setEdition(book.getEdition());
			listOfBooks.add(book1);
		}
		return listOfBooks;
	}

	@Override
	public List<Book> mapToBook(List<BookEntity> books) {
		List<Book> listOfBooks=new ArrayList<>();
		for(BookEntity book: books) {
			Book book1=new Book();
			book1.setBookId(book.getBookId());
			book1.setBookName(book.getBookName());
			book1.setAuthorName(book.getAuthorName());
			book1.setPublication(book.getPublication());
			book1.setCost(book.getCost());
			book1.setEdition(book.getEdition());
			listOfBooks.add(book1);
		}
		return listOfBooks;
	}
}
