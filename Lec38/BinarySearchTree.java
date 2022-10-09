package Lec38;

import java.util.*;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySearchTree(int[] in) {
		// TODO Auto-generated constructor stub
		this.root = CreateTree(in, 0, in.length - 1);
	}

	public Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);

		return nn;
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

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		BinarySearchTree bst = new BinarySearchTree(in);
		bst.PreOrder();
	}
}
