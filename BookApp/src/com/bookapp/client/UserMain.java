package com.bookapp.client;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImple;

public class UserMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookService bookService = new BookServiceImple();

		System.out.println("Enter Book Details : ");
		for (int i = 0; i < 2; i++) {
			System.out.println("Book " + (i + 1));
			System.out.println("Title : ");
			String title = sc.nextLine();
			System.out.println("Author : ");
			String author = sc.nextLine();
			System.out.println("Book Id : ");
			int bookId = sc.nextInt();
			sc.nextLine();
			System.out.println("Genre : ");
			String category = sc.nextLine();
			Book book = new Book(title, author, bookId, category);
			bookService.addBook(book);
			System.out.println();
		}

		System.out.println("Search books by author.");
		System.out.println("Author : ");
		String searchByAuthor = sc.nextLine();
		List<Book> searchResult = null;

		try {
			searchResult = bookService.getBookByAuthor(searchByAuthor);
			if (searchResult.size() != 0) {
				for (Book value : searchResult)
					System.out.println(value);
			}
		} catch (BookNotFoundException e) {

			System.out.println(e.getMessage());
		}

		System.out.println();
		Book book;
		System.out.println("Search books by Book Id.");
		System.out.println("Book Id : ");
		int searchById = sc.nextInt();
		sc.close();

		try {
			book = bookService.getbyId(searchById);
			System.out.println(book);
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
