package Lec32;

import Lec31.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (super.isfull() == true) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i] = data[i];
			}
			
			data=arr;

		}
		super.push(item);
		
		
		
	}

}
