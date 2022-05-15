package Lec1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 2;
		int f = 0;
		while (i < n) {
			if (n % i == 0) {
				f = f + 1;
				break;
			}
			i = i + 1;
		}
		if (f >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
