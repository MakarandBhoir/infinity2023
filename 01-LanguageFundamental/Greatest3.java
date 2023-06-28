// WAP to calculate greatest number among 3 numbers
public class Greatest3
{
	public static void main(String args[])
	{
		int num1, num2, num3;
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3 = Integer.parseInt(args[2]);

		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println("num1 is greatest.");
			}
			else
			{
				System.out.println("num3 is greatest");
			}
		}
		else
		{
			if(num2 > num3)
			{
				System.out.println("num2 is greatest.");
			}
			else
			{
				System.out.println("num3 is greatest");
			}
		}
	}
} 