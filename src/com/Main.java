package com;

import com.model.Book;

public class Main {
	public static void main(String[] args) {
		Book book=new Book();
		book.setTitle("Complete Java");
		book.setAuthor("Mick Tyson");
		System.out.println(book);
	}

}
