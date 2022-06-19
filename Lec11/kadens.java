package Lec11;

public class kadens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -4, -1, 3, -9 };
		System.out.println(SubArraySUm(arr));

	}

	public static int SubArraySUm(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum +arr[i];
			ans =Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;

	}

}
