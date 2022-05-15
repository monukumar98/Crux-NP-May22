package Lec1;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = (a + b + c) / 2;

		int area = s * (s - a) * (s - b) * (s - c);

		System.out.println(Math.sqrt(area));

	}

}
