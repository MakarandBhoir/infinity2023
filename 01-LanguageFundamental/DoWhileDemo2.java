import java.util.Scanner;

public class DoWhileDemo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int) (Math.random()*100);
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
			System.out.println("Sorry!! You loose... It was: "+randomNumber);
		}
	}
}