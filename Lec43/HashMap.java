package Lec43;

import java.util.*;

public class HashMap {

	public class Node {
		String key;
		Integer value;
		Node next;
	}

	private ArrayList<Node> list;
	private int size = 0;

	public HashMap(int x) {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			list.add(null);
		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(String key, Integer value) {
		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = list.get(bn);
		node.next = temp;
		list.set(bn, node);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / list.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * list.size(); i++) {
			nba.add(null);
		}
		ArrayList<Node> oba = list;
		list = nba;
		size = 0;
		for (Node node : oba) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
		}

	}

	public Integer get(String key) {

		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;

		}
		return null;
	}

	public boolean ContainsKey(String key) {

		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	public Integer remove(String key) {
		int bn = hashfun(key);
		Node curr = this.list.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			list.set(bn, curr.next);
		} else {
			prev.next = curr.next;
		}
		size--;
		curr.next = null;
		return curr.value;
	}

	public int hashfun(String key) {

		int bn = key.hashCode() % list.size();
		if (bn < 0) {
			bn += list.size();
		}
		return bn;

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node node : list) {
			while (node != null) {
				s = s + node.key + "=" + node.value + " ";
				node=node.next;
			}
		}
		s = s + "}";
		return s;
	}
}
