package test05;

class A{
	
}

class B extends A{
	
}

public class Test extends Object
{
	public static void main(String[] args) 
	{
		B obj = new B();
		
		if(obj instanceof B) {
			System.out.println("obj is instance of class B");
		}
		if(obj instanceof A) {
			System.out.println("obj is instance of class A");
		}
		if(obj instanceof Object) {
			System.out.println("obj is instance of class Object");
		}
		
//		Compilation error
//		if(obj instanceof Test) {
//			System.out.println("obj is instance of class Test");
//		}
		
	}
}
