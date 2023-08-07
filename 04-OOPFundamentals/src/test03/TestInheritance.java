package test03;

//Super / Parent / Base
class A{
	public A(){
		System.out.println("constructor of A.");
	}
}

// Sub / Child / Derived
class B extends A
{
	public B() {
		System.out.println("constructor of B.");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		//A obj1 = new A();
		B obj2 = new B();
	}
}
