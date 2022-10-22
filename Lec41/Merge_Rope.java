package Lec41;

import java.util.PriorityQueue;

public class Merge_Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 3, 4 };
		System.out.println(MergeCost(arr));

	}

	public static int MergeCost(int[] arr) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);

		}
		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += (a + b);
			pq.add(a + b);
		}
		return sum;
	}

}
