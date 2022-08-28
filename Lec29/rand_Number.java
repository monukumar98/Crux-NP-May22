package Lec29;

import java.util.Random;

public class rand_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int lo = -50;
		int hi = 100;
		for (int i = 0; i < 50; i++) {
			
			int item = rn.nextInt(hi-lo+1)+lo;
			System.out.print(item+" ");
		}

	}

}
