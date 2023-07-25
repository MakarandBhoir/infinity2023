package test07;
public class BookDemo {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		Book.setBookDiscount(10);
		
		//b1.bookIsbn = 123456789L;
		Book.bookDiscount = 10;
		
		b1.getData(123456789L, "Java Vol-1", 1250.50);
		b2.getData(567891234L, "Let Us C", 400.0);
		
		b1.displayData();
		b2.displayData();
	}
}
