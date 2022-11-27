package Lec50;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int cap = 4;
		System.out.println(Knapsack0_1(wt, val, cap, 0));

	}

	public static int Knapsack0_1(int[] wt, int[] val, int cap, int idx) {
		if (cap == 0 || idx == wt.length) {
			return 0;
		}
		
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + Knapsack0_1(wt, val, cap - wt[idx], idx + 1);
		}
		exc = Knapsack0_1(wt, val, cap, idx + 1);
		return Math.max(inc, exc);

	}

}
