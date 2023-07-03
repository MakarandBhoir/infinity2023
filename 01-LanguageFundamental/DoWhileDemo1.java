import java.util.Scanner;

public class DoWhileDemo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int randomNumber = 56;
		boolean status = false;
		int counter = 1;
		do
		{
			counter++;
			System.out.print("Guess the number: ");
			int number = sc.nextInt();
			if(randomNumber == number)
			{
				System.out.println("Congratulation! You have won the game!!!");
				status = true;
				break;
			}
			
		} while(counter <= 5);
		
		if(!status)
		{
			System.out.println("Sorry!! You loose...");
		}
	}
}