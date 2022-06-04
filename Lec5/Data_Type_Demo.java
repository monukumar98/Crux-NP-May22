package Lec5;

public class Data_Type_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 19;

		int x = 300;
		System.out.println(b);
		System.out.println(x);
		b = (byte) (x);
		System.out.println(b);
		byte bb = -5;
		int ii = 7871;
		ii = bb;
		System.out.println(ii);

		long ll = 3877828876l;

		float f = 7671.91f;
		double d = 7671.91;
		d = f;
		f = (float) (d);
		boolean b1 = true;
		boolean b2 = false;
		char ch = '/';
		System.out.println((int) (ch));

	}

}
