package Lec49;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int s0 = mincost(arr, 0);
		int s1 = mincost(arr, 1);
		System.out.println(Math.min(s0, s1));

	}

	public static int mincost(int[] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}
		
		int f1 =mincost(arr, i+1);
		int f2 =mincost(arr, i+2);
		return arr[i]+Math.min(f1, f2);

	}

}
