// WAP to calculate multiplication table of number.
public class ForDemo4
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		for(int i=1; i<=10; i++)
		{
			int result = num * i;
			System.out.println(result);
		}
	}
}