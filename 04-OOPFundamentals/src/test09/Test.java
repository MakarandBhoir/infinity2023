package test09;

class Parent{
	public void showName() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void showName() {
		System.out.println("Child");
		super.showName();
	}
}


public class Test {
	public static void main(String[] args) {
		Child child = new Child();
		child.showName();
	}
}
