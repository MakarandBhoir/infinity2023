package test03;

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " number of values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("------------------------------------------");
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
