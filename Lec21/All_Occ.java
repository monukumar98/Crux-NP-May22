package Lec21;

public class All_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
	}

	public static void AllOcc(int[] arr, int i, int item) {

		if (i == arr.length) {
			return;
		}

		if (arr[i] == item) {
			System.out.println(i);
		}
		AllOcc(arr, i + 1, item);

	}

}
