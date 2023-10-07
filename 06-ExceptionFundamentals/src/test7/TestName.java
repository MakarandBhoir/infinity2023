package test7;

import java.util.Scanner;

class InvalidNameException extends Exception{
	
}

public class TestName {
	static boolean validateName(String studentName) throws InvalidNameException
	{
		boolean result = studentName.matches("[A-Za-z]+");
		if(result) {
			return true;
		}
		throw new InvalidNameException();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name = scanner.next();
		
		try {
			boolean result = validateName(name);
			if(result) {
				System.out.println("Student name is verified.");
			}
		}catch(InvalidNameException ex) {
			System.out.println("Student name is not verified.");
		}
	}

}
