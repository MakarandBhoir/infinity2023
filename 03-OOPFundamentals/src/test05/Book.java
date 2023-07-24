package test05;

public class Book {
	// instance variables
	long bookIsbn;
	String bookName;
	double bookPrice;
	
	public void displayData() {
		System.out.println("Isbn = "+bookIsbn);
		System.out.println("Name = "+bookName);
		System.out.println("Price = "+bookPrice);
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.bookIsbn = 123456789L;
		b1.bookName = "Java Vol-1";
		b1.bookPrice = 1200.50;
		
		b1.displayData();
		System.out.println("--------------------------------");
		
		b2.bookIsbn = 987654321L;
		b2.bookName = "C Programming";
		b2.bookPrice = 400.0;
		
		
		b2.displayData();
	}

}
