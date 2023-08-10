package test06;

public class TestOverloading {
	public int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	public int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	
	public double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

	public static void main(String[] args) 
	{
		TestOverloading obj = new TestOverloading();
		int result1 =  obj.add(10, 20, 30);
		int result2 = obj.add(5, 7);
		double result3 = obj.add(2.0, 5.7);
		
		System.out.println("Result 1 = "+result1);
		System.out.println("Result 2 = "+result2);
		System.out.println("Result 3 = "+result3);
	}
}
