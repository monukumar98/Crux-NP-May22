package Lec41;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PriorityQueue<Integer> hp = new PriorityQueue<>();// min heap
		PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());//max heap
		hp.add(2);
		hp.add(5);
		hp.add(7);
		hp.add(1);
		hp.add(3);
		hp.add(8);
		hp.add(9);
		hp.add(11);
		hp.add(4);
		hp.add(6);
		hp.add(9);
		System.out.println(hp.peek());// view
		System.out.println(hp);
		System.out.println(hp.poll());// remove
		System.out.println(hp);

	}

}
