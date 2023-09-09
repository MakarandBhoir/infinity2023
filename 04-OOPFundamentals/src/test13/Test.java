package test13;

public class Test {
	
	static int Y = 100;
	final int X2 = 200;
	
	public static void main(String[] args) {
		final int X = 100;
		//static int Y2 = 200; // It will show you error because static can be declared within the class.
		
		//X = 102; // final - we can not change value.
		
		Y = 102; // static - we can change value.
		
		
	}
}
