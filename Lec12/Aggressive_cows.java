package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int nos = sc.nextInt();// no of stall
			int noc = sc.nextInt();// no of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(mindistance(stall, noc));

		}

	}

	public static int mindistance(int[] stall, int noc) {

		int n = stall.length;
		int lo = 0;
		int hi = stall[n - 1] - stall[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(stall, noc, mid) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		int cows=1;
		int pos=stall[0];
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]-pos>=mid) {
				cows++;
				pos=stall[i];
			}
			if(cows==noc) {
				return true;
			}
			
		}
		return false;
	}

}
