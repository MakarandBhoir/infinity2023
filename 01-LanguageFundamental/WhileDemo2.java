// WAP to calculate sum of numbers between 1 to n.
public class WhileDemo2
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		while(n > 0)
		{
			sum = sum + n;
			n--; 
		}
		System.out.println("Sum = "+sum);
	}
}