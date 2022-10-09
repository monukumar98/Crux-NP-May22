package Lec38;

public class Delete_Node_in_a_BST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}

			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					int max = max(root.left);
					root.left = deleteNode(root.left, max);
					root.val = max;
				}

			}
			return root;

		}

		private int max(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return Integer.MIN_VALUE;
			}

			int rmax = max(node.right);
			return Math.max(rmax, node.val);

		}
	}

}
