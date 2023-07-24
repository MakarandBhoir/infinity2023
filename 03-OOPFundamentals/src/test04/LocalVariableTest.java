package test04;

public class LocalVariableTest {

	public static void meth1() {
		int x = 10; // local variable of meth1
		//int x; // you will get compile time error
		System.out.println("meth1: x = " + x);
	}

	public static void main(String[] args) {
		int x = 20; // local variable of main
		System.out.println("before meth1 call, main: x = " + x);
		
		meth1();
		
		System.out.println("after meth1 call, main: x = " + x);
		
	}
}
