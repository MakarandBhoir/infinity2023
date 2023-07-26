package test11;

public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book(123456789L, "Java Vol-1", 1250.50);
		Book b2 = new Book(567891234L, "Let Us C", 400.0);
		
		Book.setBookDiscount(10);
		
		b1.displayData();
		b2.displayData();
	}
}
