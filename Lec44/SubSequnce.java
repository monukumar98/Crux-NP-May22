package Lec44;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printSub(str);

	}

	public static void printSub(String str) {

		int len = str.length();
		for (int i = 0; i < (1 << len); i++) {
			pattern(str, i);

		}

	}

	private static void pattern(String str, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i >>= 1;// i = i>>1;
			pos++;
		}
		System.out.println();

	}

}
