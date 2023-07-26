package test09;

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
