package test04;

public class InstanceVariableTest {
	// instance variable
	int x;
	char c;
	double d;
	boolean b;
	String s;
	
	public void meth1() {
		
	}
	
	public static void main(String[] args) {
		InstanceVariableTest obj = new InstanceVariableTest();
		
		System.out.println(obj.x); // default value 0
		System.out.println(obj.c); // default value \u0000
		System.out.println(obj.d); // default value 0.0
		System.out.println(obj.b); // default value false
		System.out.println(obj.s); // default value null

	}
}
