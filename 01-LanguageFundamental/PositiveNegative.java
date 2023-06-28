// WAP to check a number is positive or negative

public class PositiveNegative
{
	public static void main(String args[])
	{	
		//int number = -19";
		int number = Integer.parseInt(args[0]);
		if (number > 0)
		{
			System.out.println("Number is Positive.");
		}
		else
		{
			System.out.println("Number is Negative.");
		}
	}
}