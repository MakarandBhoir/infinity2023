package test2;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			System.out.println("First argument is = "+args[0]);
			System.out.println("Second argument is = "+args[48]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass required arguments to program.");
		}

		System.out.println("End of program");
	}
}
