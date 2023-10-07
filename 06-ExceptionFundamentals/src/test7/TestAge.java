package test7;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
	
}


public class TestAge {
	
	static boolean validateAge(int studentAge){
		if(studentAge >= 12 && studentAge <= 70) {
			return true;
		}
		InvalidAgeException ex = new InvalidAgeException();
		throw ex;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.println("Enter student age: ");
		age = scanner.nextInt();
		
		boolean result = validateAge(age);
		if(result) {
			System.out.println("Student is eligible to take admission.");
		}
	}

}
