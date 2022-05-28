package Lec4;

public class PostInc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;

		int b = a++;// a = a+1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(a);
		a = 9;
		int c = a + a++ + 89 + a++;
		System.out.println(c);
		System.out.println(a);

		int d = a + a-- + 78 + a-- - a--;
		System.out.println(d);

	}

}
