package com.bookapp.model;

public class Book {
	String title;
	String author;
	int bookId;
	String category;

	public Book(String title, String author, int bookId, String category) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.category = category;
	}

// Getters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getBookId() {
		return bookId;
	}

	public String getCategory() {
		return category;
	}

// Setters	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + ", category=" + category + "]";
	}

}
