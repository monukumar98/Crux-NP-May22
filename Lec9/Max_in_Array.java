package Lec9;

public class Max_in_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 3, 4, 5, 7, 8, 9, 91, -77, 56 };
		System.out.println(Max(arr));
	}

	public static int Max(int[] arr) {

		int max = Integer.MIN_VALUE;//-2^31
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;

	}
}
