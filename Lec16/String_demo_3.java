package Lec16;

public class String_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";

		System.out.println(str.length());

		// char at index
		System.out.println(str.charAt(3));
		str = str.concat("bye");
		System.out.println(str);
		System.out.println(str.contains("b"));

	}

}
