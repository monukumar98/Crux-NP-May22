package Lec11;

public class Maximum_Sum_Circula_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -5,-2,-5 };
		System.out.println(MaximumSum(arr));

	}

	public static int MaximumSum(int[] arr) {
		int linear_sum = kadens(arr);
		int totalsum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalsum += arr[i];// totalsum = totalsum + arr[i];
			arr[i] = arr[i] * -1;

		}
		int mid_sum = kadens(arr);

		int curr_sum = totalsum + mid_sum;
		if(curr_sum==0) {
			return linear_sum;
		}
		
		return Math.max(linear_sum, curr_sum);

	}

	public static int kadens(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}

}
