package Lec24;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 8, 5 };
		int amount = 10;
		coinPermutation(coin, amount, "");

	}

	public static void coinPermutation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				coinPermutation(coin, amount - coin[i], ans + coin[i]);
				
			}
		}
	}

}
