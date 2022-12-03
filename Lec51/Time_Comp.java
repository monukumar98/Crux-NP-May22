package Lec51;

public class Time_Comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTime();
		StringBuilderTime();

	}

	public static void StringTime() {
		String s = "";
		for (int i = 0; i < 100_000; i++) {
			s += i;

		}
		System.out.println(s);
	}

	public static void StringBuilderTime() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100_000; i++) {
			sb.append(i);

		}
		System.out.println(sb);
	}

}
