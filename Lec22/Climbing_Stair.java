package Lec22;

public class Climbing_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		answer(0, n, "");

	}

	public static void answer(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}

//		answer(curr+1, end, ans+1);
//		answer(curr+2, end, ans+2);
//		answer(curr+3, end, ans+3);
		for (int i = 1; i <= 3; i++) {
			answer(curr + i, end, ans + i);
		}

	}

}
