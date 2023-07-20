package test02;

public class Test {
	
	public void testMeth1() {
		System.out.println("testMeth1 is called.");
	}
	
	public int testMeth2() {
		int x = 1;
		System.out.println("testMeth2 is called.");
		return x;
	}
	
	public static void testMeth3() {
		System.out.println("testMeth3 is called.");
	}
	
	public static void main(String[] args) {
		System.out.println("main method called.");
		Test test = new Test();
		
		test.testMeth1();
		int result = test.testMeth2();
		System.out.println("Result = "+result);
		
		testMeth3();
	}
}
