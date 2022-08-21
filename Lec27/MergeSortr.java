package Lec27;

public class MergeSortr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 2, 6, 7, -1, 4 };
		int [] a = mergesort(arr, 0, arr.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static int [] mergesort(int []arr,int si,int ei) {
		if(si==ei) {
			int [] bs = new int [1];
			bs[0]=arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		int [] fs = mergesort(arr, si, mid);
		int [] ss = mergesort(arr, mid+1, ei);
		return mergetwosortedArray(fs,ss);
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
