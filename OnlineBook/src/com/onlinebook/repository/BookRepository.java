package com.onlinebook.repository;

import java.util.List;

import com.onlinebook.entity.BookEntity;
import com.onlinebook.response.Response;

public interface BookRepository  {
	//add book
			/**
			 * 1.addBook(Book book):Book added successfully
			 * 2.addBook(List<Book> books):50 books are added
			 * 
			 * 
			 */
		public abstract Response addBook(BookEntity book);
		public abstract Response addBook(List<BookEntity> books);
			//update book
			/**
			 * 1.updateBook(Book book):BookId does not exist (if fail)
			 * BookId updated successfully 
			 */
		public abstract Response update(BookEntity book);
			//delete book
			/**
			 * 1.deleteBookById(String bookId):BookId does not exist(if fail)
			 * BookId deleted successfully
			 * 2.deleteBookByNameAndAuthor(String bookName,String authorName):book does not exist 
			 * Book deleted successfully
			 */
		public abstract Response delete(String bookId);
		
			//Search
			/**
			 * 1.Get book by author name
			 * getBookByAuthor(String authorName):list<Book>
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
			 * getAllBook():List<Book>
			 * Please try after sometime
			 */
		public abstract BookEntity getBookById(String bookId);
		public abstract List<BookEntity> getAllBooks();
		public abstract List<BookEntity> getBookByAuthor(String authorName);
		
		public abstract List<BookEntity> getBookByAuthorAndEdition(String author, String edtion);
		public abstract List<BookEntity> getBookByAuthorAndPublication(String author, String publication);

}
