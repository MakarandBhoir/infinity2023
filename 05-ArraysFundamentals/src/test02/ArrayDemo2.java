package test02;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr [] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 15;
		arr[3] = 12;
		arr[4] = 30;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=4; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
	}

}
