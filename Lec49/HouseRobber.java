package Lec49;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		System.out.println(Robber(arr, 0));
		int dp[] = new int[arr.length];
		Arrays.fill(dp, -1);

	}

	public static int Robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = Robber(arr, i + 2);
		int dontrob = Robber(arr, i + 1);
		return Math.max(arr[i] + rob, dontrob);

	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = RobberTD(arr, i + 2, dp);// dp[i+2]
		int dontrob = RobberTD(arr, i + 1, dp);// dp[i+1]
		return dp[i] = Math.max(arr[i] + rob, dontrob);

	}

	public static int RobberBU(int[] arr) {
		
		int dp[] = new int[arr.length];
		 if(arr.length==1){
	            return arr[0];
	        }
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = dp[i - 2];
			int dontrob = dp[i-1];
			dp[i] = Math.max(arr[i] + rob, dontrob);

		}
		return dp[arr.length-1];

	}

}
