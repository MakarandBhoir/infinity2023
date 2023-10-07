package test5;

public class UnCheckExceptionDemo {
	static void testMeth() {
		throw new RuntimeException(); // un-check exception
	}
	public static void main(String[] args) {
		System.out.println("Start of program.");
		try {
			testMeth();
		}
		catch(RuntimeException e) {
			System.out.println("There is some exception.");
		}
		System.out.println("End of program.");
	}
}
