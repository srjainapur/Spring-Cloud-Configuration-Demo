package com.java.bookservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.bookservice.bean.Book;

@Service
public interface BookService {

	public List<Book> findAllBooks();

	public Book saveBook(Book book);
	
}
