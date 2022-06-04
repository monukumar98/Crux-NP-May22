package Lec6;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		long mul = 1;
		while (n > 9) {
			long t = n % 10;
			if (t >= 5) {
				sum = sum + (9 - t) * mul;
			} else {
				sum = sum + t * mul;
			}

			n = n / 10;
			mul = mul * 10;

		}
		if (n == 9) {
			sum = sum + n * mul;
		}

		else if (n >= 5) {
			sum = sum + (9 - n) * mul;
		} 
		
		else {
			sum = sum + n * mul;
		}

		System.out.println(sum);

	}

}
