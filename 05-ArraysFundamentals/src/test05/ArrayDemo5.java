package test05;

import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int[][] arr = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values in array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("-----------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"	");
			}
			System.out.println();
		}

	}

}
