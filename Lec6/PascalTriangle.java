package Lec6;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;// star
		int row = 0; // row

		while (row < n) {
            int val=1;
			int i = 0;
			while (i < star) {
				System.out.print(val + " ");
				val = ((row-i)*val)/(i+1);
				i++;
			}
			row++;
			System.out.println();
			star++;

		}

	}

}
