package Lec50;

import java.util.Arrays;

public class ValentineMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Valentine_Magic(boys, girls, 0, 0));

	}

	public static int Valentine_Magic(int[] boys, int[] girls, int i, int j) {

		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 10000000;
		}
		
		int pair = Math.abs(boys[i] - girls[j]) + Valentine_Magic(boys, girls, i + 1, j + 1);
		int nopair = Valentine_Magic(boys, girls, i, j + 1);
		return Math.min(pair, nopair);

	}

}
