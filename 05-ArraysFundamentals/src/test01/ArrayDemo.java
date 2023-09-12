package test01;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr1[] = {100, 79, 85, 49}; // size of array will be 4
										// index will start at 0 and end at 3
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		//System.out.println(arr1[4]); // ArrayIndexOutOfBoundsException
		System.out.println(arr1[-1]); // ArrayIndexOutOfBoundsException
		
		System.out.println("End of main.");
	}
}
