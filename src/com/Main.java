package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("Complete Java");
		Author author = new Author();
		author.setName("Thomsan");
		book.setAuthor("Mick Tyson");
		System.out.println(book);
	}

}
