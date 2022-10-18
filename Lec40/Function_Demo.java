package Lec40;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 30, 40, 50 };
		int [] arr2 = { 10, 20, 30, 40, 50 };
		
		display(arr);
		String[] arr1 = { "Ram", "Raj", "Riya", "Rahul", "Priya", "Pankaj" };
	    display(arr1);

	}

	private static <T> void display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
