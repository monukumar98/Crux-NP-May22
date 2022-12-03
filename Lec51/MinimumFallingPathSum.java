package Lec51;

public class MinimumFallingPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, minFallingPath(matrix, 0, i));
		}
		System.out.println(ans);
	}

	private static int minFallingPath(int[][] matrix, int i, int j) {
		if (j < 0 || j >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (i == matrix.length - 1) {
			return matrix[i][j];
		}

		int dil = minFallingPath(matrix, i + 1, j - 1);
		int dir = minFallingPath(matrix, i + 1, j + 1);
		int bel = minFallingPath(matrix, i + 1, j);
		return Math.min(dir, Math.min(dil, bel)) + matrix[i][j];

	}

}
