package Lec50;

import java.util.Arrays;

public class CoinChange_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 5 };
		int amount = 10;
		int[][] dp = new int[amount + 1][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(CoinChange(arr, amount, 0, dp));

	}

	public static int CoinChange(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[amount][idx] != -1) {
			return dp[idx][amount];
		}

		int inc = 0, exc = 0;
		if (amount >= coin[idx]) {
			inc = CoinChange(coin, amount - coin[idx], idx, dp);// dp[amount-coin[idx]][idx]
		}
		exc = CoinChange(coin, amount, idx + 1, dp);// dp[amount][idx+1]
		return dp[amount][idx] = inc + exc;

	}

	public static int CoinChagesBU(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int a = 1; a <= amount; a++) {
			for (int i = 1; i <= coin.length; i++) {

				int inc = 0, exc = 0;
				if (a >= coin[i - 1]) {
					inc = dp[a - coin[i - 1]][i];
				}
				exc = dp[a][i - 1];
				dp[a][i] = inc + exc;

			}
		}

		return dp[dp.length - 1][dp[0].length - 1];

	}

}
