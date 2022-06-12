package Lec8;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int a = sc.nextInt();
			int h = sc.nextInt();

			int ac = 0;
			int hc = 0;
			int p = 1;
			while (true) {
				ac = ac + p;
				if (ac > a) {
					System.out.println("Harshit");
					break;
				}
				p++;

				hc = hc + p;
				if (hc > h) {
					System.out.println("Aayush");
					break;
				}
				p++;

			}

			t--;
		}

	}

}
