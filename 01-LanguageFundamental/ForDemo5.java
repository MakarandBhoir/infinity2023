// WAP to calculate factorial of number.
public class ForDemo5
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		int fact=0;
		for(int i=1; i<=number; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial = "+fact);
	}
}
