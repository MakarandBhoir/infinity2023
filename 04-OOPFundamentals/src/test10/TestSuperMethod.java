package test10;

class X{
	
	int a = 10;
	
	public void showX() {
		System.out.println("showX() of class X");
	}
}

class Y extends X{
	
	private int a = 15;
	
	public void showY() 
	{
		super.showX(); // calling method of super class
		System.out.println("showY() of class Y");
		super.showX(); // calling method of super class
	}
	
	public void sum() {
		int a = 5;
		int result = this.a + super.a; // 15 + 10 = 25
		//int result = a + a; // 5 + 5 = 10
		System.out.println("Result = "+result);
	}
}

public class TestSuperMethod {
	public static void main(String[] args) {
		Y obj = new Y();
		obj.showY();
		obj.sum();
	}
}
