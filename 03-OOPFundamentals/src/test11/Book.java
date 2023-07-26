package test11;

public class Book {
	// instance variables
	private long bookIsbn;
	private String bookName;
	private double bookPrice;

	// class variable
	private static double bookDiscount;
	
	public static void setBookDiscount(double discount) {
		bookDiscount = discount;
	}
	
	Book(){
		System.out.println("Book object is created.");
		bookIsbn = -1;
		bookName = "Unknown";
		bookPrice = -1;
	}
	
	Book(long isbn, String name, double price){
		System.out.println("Book object is created.");
		bookIsbn = isbn;
		bookName = name;
		bookPrice = price;
	}
	
	private double calculateDiscount(double discount) {
		double amount = (Book.bookDiscount / 100) * bookPrice;
		double actualPrice = bookPrice - amount;
		return actualPrice;
	}
	
	public void displayData() {
		System.out.println("Isbn = " + bookIsbn);
		System.out.println("Name = " + bookName);
		System.out.println("Price = " + bookPrice);
		System.out.println("Discount = "+bookDiscount);
		System.out.println("Price after discount = " + calculateDiscount(Book.bookDiscount));
		System.out.println("-------------------------");
	}
}
