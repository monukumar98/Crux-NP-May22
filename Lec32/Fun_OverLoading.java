package Lec32;

public class Fun_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 4));
		System.out.println(add(2, 9.8f));
		System.out.println(add(2, 7, 11));
		System.out.println(add(1, 2, 3, 4, 5, 5, 11, 3, 6, 7, 6, 6, 4, 4, 7, 7));
      System.out.println(Student.val);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, float b) {
		return (int) (a + b);
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int b,int z,int... a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;

	}

}
