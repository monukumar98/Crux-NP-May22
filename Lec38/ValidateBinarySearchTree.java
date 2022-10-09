package Lec38;

public class ValidateBinarySearchTree {
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

	class BstPair {
		boolean isbst=true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
	}

	class Solution {
		public boolean isValidBST(TreeNode root) {

			return isbst(root).isbst;
		}

		public BstPair isbst(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbstp = isbst(root.left);
			BstPair rbstp = isbst(root.right);
			BstPair sbstp = new BstPair();
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, root.val));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, root.val));
			if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
				sbstp.isbst = true;
			} else {
				sbstp.isbst = false;
			}
			return sbstp;

		}
	}
}
