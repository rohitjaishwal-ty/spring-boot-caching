package com.tyss.springbootcaching;

public interface BookRepository {
	public Book getByIsbn(String isbn);
}