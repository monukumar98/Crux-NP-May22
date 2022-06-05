package Lec7;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1634;
		System.out.println(IsArmstrong(n));

	}

	public static boolean IsArmstrong(int n) {
		int d = counofdigit(n);
		int sum = 0;
		int x = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));
			n = n / 10;
		}

		if (sum == x) {
			return true;
		} else {
			return false;
		}

	}

	public static int counofdigit(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n = n / 10;

		}
		return c;

	}

}
