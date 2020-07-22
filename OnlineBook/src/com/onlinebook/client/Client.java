package com.onlinebook.client;

import java.util.ArrayList;
import java.util.List;

import com.onlinebook.factory.BookFactory;
import com.onlinebook.model.Book;
import com.onlinebook.service.BookService;
import com.onlinebook.validation.Validator;
import com.onlinebook.validation.impl.ValidatorImpl;

public class Client {
	
	public static void main(String[] args) {
		
		Book book = new Book("7", "The Bird of Time", "Sarojini Naidu", "NA", 778.95, 07);
		BookService srv = BookFactory.getServiceInstance();
//		String result = srv.addBook(book);
//		System.out.println(result);
		
//		String result = srv.update(book);
//		System.out.println(result);
		
		//List<Book> listOfBook=new ArrayList<>();
//		Book book1=new Book("7", "My Struggle", "G.D. Khosla", "NA", 540.60, 03);
//		Book book2=new Book("8", "My Struggle", "G.D. Khosla", "NA", 540.60, 03);
//		Book book3=new Book("9", "My Struggle", "G.D. Khosla", "NA", 540.60, 03);
//		listOfBook.add(book1);
//		listOfBook.add(book2);
//		listOfBook.add(book3);
//		String result2 = srv.addBook(listOfBook);
//		System.out.println(result2);
		
//		String result = srv.delete("9");
//		System.out.println(result);
		
//		Book result = srv.getBookById("5");
//		System.out.println(result);
		
//		List<Book> result = srv.getAllBooks();
//		result.forEach(System.out::println);
		
//		List<Book> result = srv.getBookByAuthor("Sarojini Naidu");
//		result.forEach(System.out::println);
		
		List<Book> result = srv.getBookByAuthorAndPublication("Vikram Seth", "NA");
		result.forEach(System.out::println);
		
	
//		Validator validate=new ValidatorImpl();
//		List<String> errors = validate.validate(book);
//		System.out.println(errors);
		
		
		
	}
}
