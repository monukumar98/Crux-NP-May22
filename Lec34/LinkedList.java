package Lec34;

public class LinkedList {

	public class Node {

		int data;
		Node next;
	}

	private Node head;
	private int size = 0;
	private Node tail;

	public void addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = head;
			head = nn;
			this.size++;
		}
	}

	public void addlast(int item) {

		if (this.size == 0) {
			addfirst(item);
		}

		else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			tail = nn;
			this.size++;
		}

	}

	public void addatindex(int k, int item) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node k_1th = getNode(k - 1);
			Node nn = new Node();
			nn.data = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;

		}
	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Bklol k ki value range me do");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;

		}
		return temp;

	}

	public void Display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		return head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		return tail.data;
	}

	public int getatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		return getNode(k).data;
	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		if (this.size == 1) {
			int rv = head.data;
			head = null;
			tail = null;
			this.size--;
			return rv;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
			return temp.data;

		}
	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		if (this.size == 1) {
			return removefirst();
		} else {
			Node sl = getNode(this.size - 2);
			int temp = tail.data;
			this.tail = sl;
			this.tail.next = null;
			this.size--;
			return temp;

		}
	}

	public int removeatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList Empty h");
		}
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {

			Node k_1th = getNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;
			
		}
	}

}
