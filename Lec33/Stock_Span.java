package Lec33;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 91, 11, 13, 15, 38, 42, 37 };
		SPan_Cal(arr);
	}

	public static void SPan_Cal(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if (!st.isEmpty()) {
				ans[i] = i - st.peek();
			} else {
				ans[i] = i + 1;
			}
			st.push(i);

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}

	}

}
