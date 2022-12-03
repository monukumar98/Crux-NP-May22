package Lec51;

public class StringBuilder_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hello");
		System.out.println(sb.charAt(2));
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("bye");
		sb.append('i');
		System.out.println(sb);
		sb.insert(2, "kk");
		System.out.println(sb);
		sb.append("abcde");
		System.out.println(sb.length());
		sb.append("abcde");
		System.out.println(sb.capacity());
		System.out.println(sb.substring(2));
		System.out.println(sb.substring(2, 4));
		String s=sb.toString();// builder to String
		StringBuilder sb1 = new StringBuilder(s);// string to builder


}
}
