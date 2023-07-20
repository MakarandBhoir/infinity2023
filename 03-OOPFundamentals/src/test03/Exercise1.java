package test03;

public class Exercise1 {
	public int computeSum(int number) 
	{
		int sum = 0;
		for(int i=1; i<=number; i++) 
		{
			if(i % 4 == 0 || i % 7 == 0) 
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Exercise1 exercise = new Exercise1();
		int result = exercise.computeSum(7);
		System.out.println("Sum is = "+result);
	}
}
