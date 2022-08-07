package Lec23;

public class Permuatation {
      static  int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		PrintPermuation(str, "");
		System.out.println(c);

	}

	public static void PrintPermuation(String Ques, String ans) {
		if(Ques.length()==0) {
			System.out.print(ans+" ");
			c++;
			return;
		}

		for (int i = 0; i < Ques.length(); i++) {
			char ch = Ques.charAt(i);
			
			
			String ros1 = Ques.substring(0, i);
			String ros2 = Ques.substring(i + 1);
			PrintPermuation(ros1 + ros2, ans + ch);

		}

	}

}
