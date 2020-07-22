package com.onlinebook.validation;

import java.util.List;

import com.onlinebook.model.Book;

public interface Validator {

	public abstract List<String> validate(Book book);
		
	
}
