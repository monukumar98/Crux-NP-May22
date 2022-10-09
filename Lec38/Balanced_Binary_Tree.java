package Lec38;

public class Balanced_Binary_Tree {
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
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}

			boolean lp = isBalanced(root.left);
			boolean rp = isBalanced(root.right);
			boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return sb && rp && lp;

		}

		private int ht(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return -1;
			}

			int lh = ht(node.left);
			int rh = ht(node.right);

			return Math.max(lh, rh) + 1;
		}
	}

}
