package com.onlinebook.mapper;

import java.util.List;

import com.onlinebook.entity.BookEntity;
import com.onlinebook.model.Book;


public interface Mapper {
	
	public abstract BookEntity mapToBookEntity(Book book);
	
	public abstract Book mapToBook(BookEntity book);
	
	public abstract List<BookEntity> mapToBookEntity(List<Book> books);
	
	public abstract List<Book> mapToBook(List<BookEntity> books);
		
	
}
