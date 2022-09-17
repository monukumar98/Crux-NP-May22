package Lec31;

public class Stack {
	protected int[] data;
	private int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.tos = -1;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public boolean isfull() {
		return tos == data.length - 1;
	}

	public void push(int item) throws Exception {
		if(isfull()==true) {
			throw new Exception("Bhai pgl ho Stack full hai");
		}
		tos++;
		data[tos] = item;
	}
	public int pop() throws Exception {
		if(isEmpty()==true) {
			throw new Exception("Bhai pgl ho Stack khaali hai");
		}
		int re = this.data[tos];
		tos--;
		return re;
	}

	public int peek() throws Exception {
		if(isEmpty()==true) {
			throw new Exception("Bhai pgl ho Stack khaali hai");
		}
		int re = this.data[tos];
		return re;
	}

	public int size() {
		return tos + 1;
	}

	public void Display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(data[i] + " ");

		}
		System.out.println();
	}

}
