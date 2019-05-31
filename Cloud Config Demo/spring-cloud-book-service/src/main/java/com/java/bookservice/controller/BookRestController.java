package com.java.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.bookservice.bean.Book;
import com.java.bookservice.service.BookService;

@RestController
@RequestMapping(value="/book")
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveBook(@RequestBody Book book) {
		Book saveBook = bookService.saveBook(book);
		return "Book with Id : " + saveBook.getId() + " Saved Successfully"; 
	}
}
