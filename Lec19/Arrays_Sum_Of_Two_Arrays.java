package Lec19;

import java.util.ArrayList;
import java.util.Scanner;


public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			// list.add(sc.next());
		}

		int m = sc.nextInt();
		int[] brr = new int[m];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = sc.nextInt();
		}
		AddNumber(arr, brr);

	}

	public static void AddNumber(int[] arr, int[] brr) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = arr.length - 1;
		int j = brr.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {

			int sum = 0;
			if (i >= 0) {
				sum = sum + arr[i];
				i--;
			}
			if (j >= 0) {
				sum = sum + brr[j];
				j--;
			}
			sum = sum + carry;
			list.add(sum % 10);
			carry = sum / 10;

		}
		if(carry>0) {
			list.add(carry);
		}
		for (int k = list.size() - 1; k >= 0; k--) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.println("END");

	}

}
