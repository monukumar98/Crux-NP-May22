package Lec8;

public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = -10;
		Display(arr);

	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
