package test07;

class Parent{
	public void printName() {
		System.out.println("Parent Name printed !!!");
	}
}

class Child extends Parent{
	@Override
	public void printName() {
		System.out.println("Child Name printed !!!");
	}
}


public class TestOverriding {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.printName();
		
		Child child = new Child();
		child.printName();
	}
}
