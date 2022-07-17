package Lec17;

public class PlaywithGood_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "baaafganvafhhgjaaaa";
		System.out.println(GoodString(str));

	}

	public static int GoodString(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Isvowels(str.charAt(i)) ) {
				int count = 0;
				while (i < str.length() && Isvowels(str.charAt(i)) == true) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);
			}

		}
		return ans;

	}

	public static boolean Isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			return true;
		}
		return false;

	}

}
