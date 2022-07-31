package Lec21;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
		System.out.println(LastIndex(arr, arr.length - 1, 3));

	}

	private static int LastIndex(int[] arr, int i, int item) {
		// TODO Auto-generated method stub
		if(i<0) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}
		
		return LastIndex(arr, i-1, item);
	}

}
