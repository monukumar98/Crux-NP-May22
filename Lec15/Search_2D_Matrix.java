package Lec15;

public class Search_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.println(Search(arr, 8));

	}

	public static boolean Search(int[][] arr, int target) {
		int col = arr[0].length - 1;
		int row = 0;
		while (col >= 0 && row < arr.length) {

			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] < target) {
				row++;

			} else {
				col--;
			}

		}
		return false;
	}

}
