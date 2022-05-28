package Lec4;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int star = 1;
		int row = 1;
		int a = 0;
		int b = 1;
		while (row <= n) {

			int i = 1;
			while (i <= star) {
				System.out.print(a + " ");
				int c = a + b;
				a = b;
				b = c;
				i++;
			}
			row++;
			System.out.println();
			star++;

		}

	}

}
