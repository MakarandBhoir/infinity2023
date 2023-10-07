package test5;

import java.io.IOException;

public class CheckExceptionDemo {
	static void testMeth() throws IOException {
		throw new IOException(); //checked exception
	}
	
	public static void main(String[] args) {
		System.out.println("Start of program.");
		try {
			testMeth();
		}
		catch(IOException e) {
			System.out.println("There is some exception.");
		}
		System.out.println("End of program.");
	}
}
