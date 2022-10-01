package Lec36;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		str = "<--" + node.data + "-->";
		if (node.left != null) {
			str = node.left.data + str;
		} else {
			str = "." + str;
		}
		if (node.right != null) {
			str = str + node.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(node.left);
		Display(node.right);

	}

	public int max() {

		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int leftmax = max(node.left);
		int rightmax = max(node.right);
		return Math.max(node.data, Math.max(leftmax, rightmax));

	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {

		if (nn == null) {
			return false;
		}
		if (nn.data == item) {
			return true;
		}
		return find(nn.left, item) || find(nn.right, item);
	}

	public int ht() {

		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		INOrder(node.left);
		System.out.print(node.data + " ");
		INOrder(node.right);

	}

	public void levelorder() {
		// LinkedList<Node> q = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node rv = q.remove();
			// Node rv=q.poll();
			System.out.print(rv.data + " ");

			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}

}
