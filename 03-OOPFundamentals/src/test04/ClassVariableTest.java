package test04;

public class ClassVariableTest {
	// class variable
	static int x;
	static char c;
	static double d;
	static boolean b;
	static String s;
	
	public void meth1() {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(x); // default value 0
		System.out.println(c); // default value \u0000
		System.out.println(d); // default value 0.0
		System.out.println(b); // default value false
		System.out.println(s); // default value null
	}
}
