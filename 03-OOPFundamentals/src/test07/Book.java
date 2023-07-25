package test07;

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
	
	void getData(long isbn, String name, double price) {
		bookIsbn = isbn;
		bookName = name;
		bookPrice = price;
	}
	
	public void displayData() {
		System.out.println("Isbn = " + bookIsbn);
		System.out.println("Name = " + bookName);
		System.out.println("Price = " + bookPrice);
		System.out.println("Discount = "+bookDiscount);
		System.out.println("-------------------------");
	}
}
