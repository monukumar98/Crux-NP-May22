package Lec16;

public class SubStringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (ispal(str.substring(i, j)) == true)
					System.out.println(str.substring(i, j));

			}

		}

	}

	public static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

}
