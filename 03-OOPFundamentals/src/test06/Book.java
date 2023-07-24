package test06;

public class Book {
	// instance variables
	long bookIsbn;
	String bookName;
	double bookPrice;
	
	// class variable
	static double bookDiscount;
	
	public void getData(long isbn, String name, double price) {
		bookIsbn = isbn;
		bookName = name;
		bookPrice = price;
	}
	
	public void displayData() {
		System.out.println("Isbn = " + bookIsbn);
		System.out.println("Name = " + bookName);
		System.out.println("Price = " + bookPrice);
		System.out.println("Discount = "+bookDiscount);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		bookDiscount = 10;
		
		b1.getData(123456789L, "Java Vol-1", 1200.50);
		b2.getData(987654321L, "Let Us C", 400.00);
		
		b1.displayData();
		System.out.println("--------------------------------");
		b2.displayData();
		
		System.out.println("---------------------------------");
		
		bookDiscount = 7.5;
		b1.bookName = "Java Vol-2";
		
		b1.displayData();
		System.out.println("--------------------------------");
		b2.displayData();
	}
}
