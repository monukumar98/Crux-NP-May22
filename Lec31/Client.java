package Lec31;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P obj = new P();
		// C obj1 = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();

		// Case -2
		P obj = new C();
		System.out.println(obj.d);//
		System.out.println(obj.d1);// 10
		System.out.println(((C) (obj)).d2);// 20
		System.out.println(((C) (obj)).d);// 20

		obj.fun();
		obj.fun1();
		((C) (obj)).fun2();

//		C obj1 = new P();
//		System.out.println(obj1.d2);
		C obj1 = new C();
		

	}

}
