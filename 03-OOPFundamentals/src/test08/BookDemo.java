package test08;

import test07.Book;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		//b1.bookIsbn = 123456789L;
		//Book.bookDiscount = 10;
		
		// This method call will give you error because getData is declared as default
		//b1.getData(123456789L, "Java Vol-1", 1250.50);
	}
}
