package Lec27;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 7, 8, 11 };
		int[] arr1 = { 1, 2, 5, 6, 9, 11, 13, 14 };
		int[] ans = mergetwosortedArray(arr, arr1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] mergetwosortedArray(int[] arr, int[] arr1) {
		int n = arr.length;
		int m = arr1.length;
		int[] ans = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < n && j < m) {
			if (arr[i] < arr1[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr1[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr1[j];
			j++;
			k++;
		}
		return ans;

	}

}
