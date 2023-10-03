package test4;

public class ExceptionDemo {
	
	public static void isValidAge(int age) { // int age = -1;
		if(age >= 5 && age <= 60) {
			System.out.println("Valid Age = "+age);
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	public static void main(String[] args) {
		try { 
			ExceptionDemo.isValidAge(19);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Please pass valid name of age.");
		}
		finally {
			System.out.println("Always executed.");
		}
	}
}
