package Lec23;

public class Key_Paid {
	static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "189";
		KeyPaid(str, "");

	}

	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);
		int idx = ch - '0';
		String key = arr[idx];
		for (int i = 0; i < key.length(); i++) {
			KeyPaid(ques.substring(1), ans + key.charAt(i));

		}

	}

}
