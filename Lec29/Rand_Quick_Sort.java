package Lec29;

import java.util.Random;

public class Rand_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 15, 13, 2, 1, -5, 7, 9, 6, 3, 11, 5 };
		QuickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void QuickSort(int[] arr, int si, int ei) {
		if (si > ei) {
			return;
		}
		Random(arr, si, ei);
		int pi = partition(arr, si, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);
	}

	public static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int pivote = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivote) {
				int temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}

		}
		int temp = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = temp;
		return pi;

	}

	public static void Random(int[] arr, int si, int ei) {
		Random rn = new Random();

		int i = rn.nextInt(ei - si + 1) + si;
		int temp = arr[i];
		arr[i] = arr[ei];
		arr[ei] = temp;
	}

}
