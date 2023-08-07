package test04;

//Super / Parent / Base
class A{
	public A(){
		System.out.println("constructor of A.");
	}
	public A(int a) {
		System.out.println("parameterized constructor of A.");
	}
}

// Sub / Child / Derived
class B extends A
{
	public B() {
		super(100);
		System.out.println("constructor of B.");
	}
	public B(int b) {
		super(b);
		System.out.println("parameterized constructor of B.");
	}
	
}

public class TestInheritance {
	public static void main(String[] args) {
		B obj1 = new B();
		B obj2 = new B(1000);
	}
}
