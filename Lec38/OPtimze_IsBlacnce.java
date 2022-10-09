package Lec38;

public class OPtimze_IsBlacnce {
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

	class BalancePair {
		boolean isbal = true;
		int ht = -1;
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return Balance(root).isbal;
		}

		public BalancePair Balance(TreeNode root) {
			if (root == null) {
				return new BalancePair();
			}

			BalancePair lbp = Balance(root.left);
			BalancePair rbp = Balance(root.right);
			BalancePair sbp = new BalancePair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = lbp.isbal && rbp.isbal && sb;
			return sbp;

		}

	}
}
