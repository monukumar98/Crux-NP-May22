package Lec44;

public class Uniq_number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 3, 4, 2, 6 };
		Uniq_number2(arr);

	}

	public static void Uniq_number2(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];

		}
		int a = 0;
		int mask = ans & (~(ans - 1));
		for (int i = 0; i < arr.length; i++) {
			if ((mask & arr[i]) == 0) {
				a = a ^ arr[i];
			}
		}
		int b = ans ^ a;
		System.out.println(a + " " + b);

	}

}
