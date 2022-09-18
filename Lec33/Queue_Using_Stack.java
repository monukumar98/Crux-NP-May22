package Lec33;

import java.util.Stack;

public class Queue_Using_Stack {

	private Stack<Integer> data;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		this.data = new Stack<>();
	}

	public boolean isempty() {
		return this.data.isEmpty();
	}

	public int size() {
		return this.data.size();
	}

	public void Enqueue(int item) {
		this.data.push(item);
	}

	public int Dequeue() {
		Stack<Integer> hlp = new Stack<>();
		while (data.size() > 1) {
			hlp.push(data.pop());
		}
		int ii = data.pop();
		while (hlp.size() > 1) {
			data.push(hlp.pop());
		}
		return ii;
	}

	public int Getfornt() {
		Stack<Integer> hlp = new Stack<>();
		while (data.size() > 1) {
			hlp.push(data.pop());
		}
		int ii = data.peek();
		while (hlp.size() > 1) {
			data.push(hlp.pop());
		}
		return ii;
	}

	public static void main(String[] args) {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.Getfornt());

	}
}
