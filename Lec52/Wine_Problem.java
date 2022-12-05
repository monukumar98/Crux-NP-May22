package Lec52;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };

		System.out.println(MaxProfit(wine, 0, wine.length - 1, 1));
		System.out.println(MaxProfit(wine));

	}

	public static int MaxProfit(int[] arr, int i, int j, int year) {
		if (i > j) {
			return 0;
		}

		int ith = arr[i] * year + MaxProfit(arr, i + 1, j, year + 1);
		int jth = arr[j] * year + MaxProfit(arr, i, j - 1, year + 1);

		return Math.max(ith, jth);

	}

	public static int MaxProfit(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];
		int year = arr.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = arr[i] * year;
		}
		year--;
		for (int slide = 1; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				int ith = arr[i] * year + dp[i + 1][j];
				int jth = arr[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(ith, jth);
			}
			year--;

		}
		return dp[0][arr.length - 1];

	}

}
