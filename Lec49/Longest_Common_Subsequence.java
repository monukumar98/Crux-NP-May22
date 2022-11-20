package Lec49;

import java.util.Arrays;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		int[][] dp = new int[s1.length()][s2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcs(s1, s2, 0, 0, dp));

	}

	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);// dp[i+1][j+1]
		} else {
			int fs = lcs(s1, s2, i + 1, j, dp);// dp[i+1][j]
			int ss = lcs(s1, s2, i, j + 1, dp);// dp[i][j+1]
			ans = Math.max(fs, ss);
		}
		return dp[i][j] = ans;

	}

	public static int lcsBu(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}

		}
		return dp[s1.length()][s2.length()];
	}

}
