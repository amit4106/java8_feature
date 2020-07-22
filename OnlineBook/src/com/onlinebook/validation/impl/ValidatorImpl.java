package com.onlinebook.validation.impl;

import java.util.ArrayList;
import java.util.List;

import com.onlinebook.model.Book;
import com.onlinebook.validation.Validator;

public class ValidatorImpl implements Validator {

	@Override
	public List<String> validate(Book book) {

		List<String> errors = new ArrayList<>();
		if (book != null) {
			if (book.getBookId() == null) {
				errors.add("BookID must not be null");
			} else if (book.getBookId().length() != 10) {
				errors.add("BookID must be of length 10 charactors");

			}
		}

		return errors;
	}

}
