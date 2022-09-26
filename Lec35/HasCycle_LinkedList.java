package Lec35;


public class HasCycle_LinkedList {

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

	public void CreateCycle() {
		// this.tail.next=this.head;// Circular and cycle both
		this.tail.next = this.head.next;
	}

	public boolean hasCycle(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}

		}

		return false;

	}

}
