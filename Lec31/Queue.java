package Lec31;

public class Queue {
	protected int[] data;
	protected int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		front = 0;
		size = 0;
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		data = new int[cap];
		front = 0;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;

	}

	public boolean isfull() {
		return size == data.length;

	}

	public void Enqueue(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("Bhai pgl ho Queue full hai");
		}
		int idx = (size + front) % data.length;
		data[idx] = item;
		size++;

	}

	public int Dequeue() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Bhai pgl ho Queue khaali hai");
		}
		int re = data[front];
		front = (front + 1) % data.length;
		size--;
		return re;
	}

	public int getfront() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Bhai pgl ho Queue khaali hai");
		}
		int re = data[front];

		return re;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}

	public int size() {
		return size();
	}
}
