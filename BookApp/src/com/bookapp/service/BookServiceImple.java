package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImple implements BookService {

	@Override
	public List<Book> getAllBooks() {

		return list;
	}

	ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book book) {
		list.add(book);
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		ArrayList<Book> searchList = new ArrayList<>();

		for (Book book : list) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				searchList.add(book);
			}
		}
		if (searchList.isEmpty()) {
			throw new BookNotFoundException("Sorry ! Book Unavailabvle. ");
		} else
			return searchList;

	}

	@Override
	public Book getbyId(int id) throws BookNotFoundException {
		for (Book book : list) {
			if (book.getBookId() == id)
				return book;
		}
		throw new BookNotFoundException("Sorry ! Book Unavailabvle. ");

	}

}
