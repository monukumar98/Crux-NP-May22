package Lec7;

public class FunDemoPart_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 9;
		int b = 78;
		adddition(a, b);
		System.out.println("Rahul");
		System.out.println("bye");
	}

	public static void adddition(int a, int b) {

		sub(a, b);
		int c = a + b;
		System.out.println(c);

	}

	public static void sub(int a, int b) {

		int c = a - b;
		System.out.println(c);

	}

}
