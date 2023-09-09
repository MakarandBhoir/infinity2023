package test13;

import static java.lang.Math.*;

public class Test3 {
	public static void main(String[] args) {
		
		double randomValue = random();
		System.out.println(randomValue);
		
		int randomValue2 = (int) (randomValue * 100);
		
		System.out.println(randomValue2);
	}
}
