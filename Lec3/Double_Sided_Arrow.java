package Lec3;

import java.util.Scanner;

public class Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp1 = n - 1;
		int sp2 = -1;
		int star = 1;
		int val = 1;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= sp1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int v = val;
			while (j <= star) {
				System.out.print(v + " ");
				v--;
				j++;
			}
			int k = 1;
			while (k <= sp2) {
				System.out.print("  ");
				k++;
			}
			int l = 1;
			if (row == 1 || row == n) {
				l++;
			}
			while (l <= star) {
				System.out.print(l+" ");
				l++;
			}

			if (row <= n / 2) {
				star++;
				sp1 -= 2;
				sp2 += 2;
				val++;
			} else {
				star--;
				sp1 += 2;
				sp2 -= 2;
				val--;
			}
			row++;
			System.out.println();
		}

	}

}
