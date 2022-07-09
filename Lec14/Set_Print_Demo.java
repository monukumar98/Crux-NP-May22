package Lec14;

public class Set_Print_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];

		// row
		int row = arr.length;
		// column
		int col = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}
