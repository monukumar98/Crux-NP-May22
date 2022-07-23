package Lec17;

import java.util.Scanner;

public class Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String s = sc.next();
//		
		
		
		String str = "692239";
		PrintSubString(str);

	}

	public static void PrintSubString(String str) {
		int count = 0;
		boolean visited[] = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				// Integer.parseInt(s)--> String to Integer changes krega
				if (isCbNumber(Long.parseLong(s)) == true && isvisited(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k <= j - 1; k++) {
						visited[k] = true;

					}
				}

			}

		}
		System.out.println(count);

	}

	public static boolean isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbNumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
