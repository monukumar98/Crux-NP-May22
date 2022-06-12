package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 3, 4, 5, 7, 8, 9, 91, -77, 56 };
		int item = 5;
		System.out.println(Search(arr, item));
	}

	public static int Search(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;
	}

}
