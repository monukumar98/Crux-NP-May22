package Lec45;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(CountContest(arr, n, l, r, x));
	}

	public static int CountContest(int[] arr, int n, int l, int r, int x) {
		int ans = 0;
		for (int i = 0; i < (1 << n); i++) {

			if (FastCountSet(i) >= 2 && isValid(arr, i, l, r, x) == true) {
				ans++;
			}
		}
		return ans;
	}

	private static boolean isValid(int[] arr, int i, int l, int r, int x) {
		// TODO Auto-generated method stub
		int pos = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while (i > 0) {
			if ((i & 1) != 0) {
				sum += arr[pos];
				min = Math.min(min, arr[pos]);
				max = Math.max(max, arr[pos]);
			}
			i >>= 1;// i = i>>1;
			pos++;
		}
		return sum >= l && sum <= r && max - min >= x;
	}

	public static int FastCountSet(int n) {

		int ans = 0;
		while (n > 0) {

			ans++;
			n = (n & (n - 1));

		}
		return ans;

	}
}
