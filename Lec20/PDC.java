package Lec20;

public class PDC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Print(n);

	}

	public static void Print(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		Print(n - 1);
	}

}
