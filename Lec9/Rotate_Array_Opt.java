package Lec9;

public class Rotate_Array_Opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

	}

	public static void RotateArrayOPt(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		Reverse(arr, n-k, n-1);
		Reverse(arr, 0, n-k-1);
		Reverse(arr, 0, n-1);
		

	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}

}
