package Lec22;

public class Coin_Toss_N0_two_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printanswer(n, "");

	}

	public static void printanswer(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}

		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			printanswer(n - 1, ans + "H");
		}
		printanswer(n - 1, ans + "T");

	}

}
