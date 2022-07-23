package Lec18;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abahsfhjgjhhelljgah";
		int[] ans = Freq(str);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] Freq(String str) {
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'a'] = freq[ch - 'a'] + 1;

		}
		return freq;

	}

}
