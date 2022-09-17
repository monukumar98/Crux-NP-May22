package Lec32;

import Lec31.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull() == true) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				int idx = (front + i) % data.length;
				arr[i] = data[idx];
			}
			this.front = 0;
			data = arr;

		}
		super.Enqueue(item);

	}

}
