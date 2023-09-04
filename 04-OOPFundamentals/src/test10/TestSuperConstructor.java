package test10;

// 1. super keyword will help us to call constructor of super class
// 2. method of super class
// 3. variable of super class


class A{
	private int a; // instance variable
	A(){
		System.out.println("A()");
	}
	A(int a){ // local variable
		this.a = a; // instance variable = local variable
		System.out.println("A(int a)");
	}
}

class B extends A{
	private int b;
	B(){
		//System.out.println("B()");
		super(10);
		System.out.println("B()");
	}
	B(int b){
		super();
		System.out.println("B(int b)");
	}
}

public class TestSuperConstructor {
	public static void main(String[] args) {
		//B obj1 = new B();
		B obj2 = new B(200);
	}
}
