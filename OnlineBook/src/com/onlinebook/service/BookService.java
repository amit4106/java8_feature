package com.onlinebook.service;

import java.util.List;

import com.onlinebook.model.Book;

public interface BookService {
	//add book
		/**
		 * 1.addBook(Book book):Book added successfully
		 * 2.addBook(List<Book> books):50 books are added
		 * 
		 */
		public abstract String addBook(Book book);
		public abstract String addBook(List<Book> book);
		
		//update book
		/**
		 * 1.updateBook(Book book):BookId does not exist (if fail)
		 * BookId updated successfully 
		 */
		public abstract String update(Book book);
		
		//delete book
		/**
		 * 1.deleteBookById(String bookId):BookId does not exist(if fail)
		 * BookId deleted successfully
		 * 2.deleteBookByNameAndAuthor(String bookName,String authorName):book does not exist 
		 * Book deleted successfully
		 */
		public abstract String delete(String bookId);
		
		//Search
		/**
		 * 1.Get book by author name
		 * getBookByAuthor(String authorName):List<Book>
		 * Book does not exist(if fail)
		 * 
		 * 2.get book by author name and edition
		 * getBookByAuthorAndEdition(String author,String edition):List<Book>
		 * Book does not exist(if fail)
		 * 
		 * 3.get book by author name and publication
		 * getBookByAuthorAndPublication(String author,String publication):List<Book>
		 * Book does not exist(if fail)
		 * 
		 * 4.get book by bookId
		 * getBookById(String bookId):Book
		 * bookId does not exist(if fail)
		 * 
		 * 5.get allBook
		 * getAllBooks():List<Book>
		 * Please try after sometime
		 */
		
		public abstract Book getBookById(String bookId);	// done
		public abstract List<Book> getAllBooks();			// done
		public abstract List<Book> getBookByAuthor(String authorName);	//done
		
		public abstract List<Book> getBookByAuthorAndEdition(String author, String edtion);
		public abstract List<Book> getBookByAuthorAndPublication(String author, String publication);
		
		
}







