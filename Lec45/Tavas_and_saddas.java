package Lec45;

public class Tavas_and_saddas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "6565";
		System.out.println(index(str));

	}

	public static int index(String str) {
		int n = str.length();
		int count = (1 << n) - 2;
		int pos = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (str.charAt(i) == '6') {
				count = count + (1 << pos);
			}
			pos++;
		}
		return count + 1;

	}
}
