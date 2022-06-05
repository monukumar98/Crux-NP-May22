package Lec7;

public class Glo_variable {
	static int v=10 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(v);
		fun();
		System.out.println(v);

	}

	

	public static void fun() {

		int v = 90;
		System.out.println(v + 90);
		System.out.println(v);
		v = v + 4;
		Glo_variable.v= Glo_variable.v+1089;
		System.out.println(Glo_variable.v);

	}
}
