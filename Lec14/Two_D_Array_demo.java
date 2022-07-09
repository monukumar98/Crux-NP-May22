package Lec14;

public class Two_D_Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr[0]);
		System.out.println(arr);
		System.out.println(arr[2]);

		System.out.println(arr[1][3]);

		int[][] other = arr;
		System.out.println(other);

	}

}