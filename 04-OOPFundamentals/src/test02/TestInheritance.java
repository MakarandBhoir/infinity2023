package test02;

//Super / Parent / Base
class A{
	public void meth1() {
		System.out.println("meth1 of class A");
	}
}

// Sub / Child / Derived
class B extends A
{
	public void meth2() {
		System.out.println("meth2 of class B");
	}
}

class C extends B{
	public void meth3() {
		System.out.println("meth3 of class C");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
	}
}
