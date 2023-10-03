package test04;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20 }, { 90, 15 } };

		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);

		System.out.println("------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}

	}
}
