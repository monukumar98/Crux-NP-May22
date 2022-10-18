package Lec40;


import java.util.*;

public class CarSClinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
		// Sort(arr);
//		Arrays.sort(arr, new Comparator<Cars>() {
//
//			@Override
//			public int compare(Cars o1, Cars o2) {
//				// TODO Auto-generated method stub
//				return o1.speed-o2.speed;
//			}
//		});
		
		Sort(arr , new CarColorComparator());
		Display(arr);

	}

	public static <T> void Display(T[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		System.out.println();
	}

//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		for (int trun = 1; trun < arr.length; trun++) {
//			for (int i = 0; i < arr.length - trun; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T t = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = t;
//				}
//
//			}
//		}
//	}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}
		}
	}

}
