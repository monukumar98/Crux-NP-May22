package Lec11;


public class Maximum_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,-4,-1,3,-9};
		System.out.println(SubArraySUm(arr));

	}
	public static int SubArraySUm(int []arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
				ans = Math.max(ans, sum);
			}
			
		}
		return ans;
	}


}
