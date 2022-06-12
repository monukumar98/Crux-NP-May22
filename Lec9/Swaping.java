package Lec9;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 12;
		System.out.println(a + " " + b);
		swap(a, b);
		System.out.println(a + " " + b);

	}

	public static void swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

	}

}
