package com.bookapp.service;

import java.util.List;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	void addBook(Book book);

	List<Book> getBookByAuthor(String author) throws BookNotFoundException;
	
	List<Book> getAllBooks() ;

	Book getbyId(int id) throws BookNotFoundException;
}
