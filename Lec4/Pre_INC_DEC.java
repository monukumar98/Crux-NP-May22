package Lec4;

public class Pre_INC_DEC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
		System.out.println(++a);

		int c = a + 78 + a++ - a-- - ++a - a--;
		System.out.println(c);
		System.out.println(a);

	}

}
