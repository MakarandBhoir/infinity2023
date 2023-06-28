/* WAP to calculate sum of all digits of a number. 
	e.g. if number = 1234 = 1 + 2 + 3 + 4 = 10, 
		number=678 = 6 + 7 + 8 = 21 */

import java.lang.*; // default package
import java.util.*;

public class WhileDemo3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); // creating object
		System.out.print("Enter any number: ");
		int number = sc.nextInt();
		System.out.println("You have enter = "+number);
	}
}