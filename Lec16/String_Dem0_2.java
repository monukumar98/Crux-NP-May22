package Lec16;

public class String_Dem0_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		String str1 = "hello";
		String str4 = "hellobye";
		System.out.println(str==str1);
		String str2 = new String("hello");
		String str3 =new String("hello");
		System.out.println(str2==str3);
		
		System.out.println(str2.equals(str3));
	

	}

}
