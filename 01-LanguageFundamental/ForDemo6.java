// WAP to check whether number is prime or not.

public class ForDemo6
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		boolean isPrime = true;
		for(int i=2; i<number; i++)
		{
			if(number % i == 0)
			{
				System.out.println("Number = " + number + " is not prime.");
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Number = " + number + " is prime.");
		}
	}
}