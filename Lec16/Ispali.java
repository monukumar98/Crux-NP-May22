package Lec16;

import java.util.Scanner;

public class Ispali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(ispal(str));

	}

	public static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

}
