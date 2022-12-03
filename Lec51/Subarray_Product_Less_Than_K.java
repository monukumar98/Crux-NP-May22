package Lec51;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(NumberofzsubArray(arr, k));

	}

	public static int NumberofzsubArray(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans = 0;
		while (ei < arr.length) {
			p = p * arr[ei];// grow
			while (p >= k && si <= ei) {// shrink
				p = p / arr[si];
				si++;
			}
			// ans

			ans = ans + ei - si + 1;
			ei++;
		}
		return ans;

	}

}
