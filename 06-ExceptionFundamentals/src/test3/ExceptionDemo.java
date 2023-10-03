package test3;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			System.out.println("First argument is = " + args[0]);
			System.out.println("Second argument is = " + args[1]);
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			int add = num1 + num2;
			System.out.println("Addition is = " + add);
			
			double div = num1 / num2;
			System.out.println("Division is = " + div);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please pass required arguments to program.");
		}
		catch(NumberFormatException e) {
			System.out.println("Please pass correct number.");
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide by zero.");
		}

		System.out.println("End of program");
	}
}
