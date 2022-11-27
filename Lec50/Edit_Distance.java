package Lec50;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "food";
		String s2 = "money";
		System.out.println(EditDistance(s1, s2, 0, 0));

	}

	public static int EditDistance(String s1, String s2, int i, int j) {

		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = EditDistance(s1, s2, i + 1, j + 1);// dp[i-1][j-1]
		} else {
			int D = EditDistance(s1, s2, i + 1, j);// dp[i-1][j]
			int I = EditDistance(s1, s2, i, j + 1);// dp[i][j-1]
			int R = EditDistance(s1, s2, i + 1, j + 1);// dp[i-1][j-1]
			ans = Math.min(I, Math.min(D, R)) + 1;
		}
		return ans;
	}

}
