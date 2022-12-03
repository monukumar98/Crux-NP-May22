package Lec51;

public class MaximumSumofWindowSize_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 2, 5, 6, 8, 7, 1, 4, 2 };
		int k = 3;
		System.out.println(MaximumSum(arr, k));

	}

	public static int MaximumSum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];

		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];// grow
			sum -= arr[i - k];// shrink
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
