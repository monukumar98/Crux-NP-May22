package Lec20;

public class PID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		PI(n);

	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PI(n - 1);
		System.out.println(n);
	}

}
