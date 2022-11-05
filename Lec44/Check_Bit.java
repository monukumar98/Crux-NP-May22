package Lec44;

public class Check_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 89;
		int pos = 4;
		if (SetBit(n, pos)) {
			System.out.println("set hai");
		} else {
			System.out.println("Set nhi hai ");
		}

	}

	public static boolean SetBit(int n, int pos) {

		int mask = 1 << pos;
		return (n & mask) != 0;
	}

}
