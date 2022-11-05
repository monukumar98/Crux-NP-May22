package Lec44;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57;
		System.out.println(CountSet(n));

	}

	public static int CountSet(int n) {

		int ans = 0;
		while (n > 0) {

			if ((n & 1) != 0) {
				ans++;
			}

			n >>= 1;

		}
		return ans;

	}

	public static int FastCountSet(int n) {

		int ans = 0;
		while (n > 0) {

			ans++;
			n = (n & (n - 1));

		}
		return ans;

	}

}
