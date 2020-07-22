package com.onlinebook.factory;

import com.onlinebook.mapper.Mapper;
import com.onlinebook.mapper.impl.MapperImpl;
import com.onlinebook.repository.BookRepository;
import com.onlinebook.repository.impl.BookRepositoryImpl;
import com.onlinebook.service.BookService;
import com.onlinebook.service.impl.BookServiceImpl;
import com.onlinebook.template.JdbcTemplate;

public class BookFactory {
	public static BookService getServiceInstance() {
		return new BookServiceImpl();
	}

	public static BookRepository getRepositoryInstance() {
		return new BookRepositoryImpl();
	}

	public static JdbcTemplate getJdbcTemplateInstance() {
		return new JdbcTemplate();
	}
	public static Mapper getMapperInstance() {
		return new MapperImpl();
	}

}

