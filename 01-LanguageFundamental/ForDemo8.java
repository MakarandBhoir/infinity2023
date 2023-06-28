public class ForDemo8
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}