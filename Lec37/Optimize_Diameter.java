package Lec37;

public class Optimize_Diameter {

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

	class DiaPair {
		int h = -1;
		int d = 0;
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
			return Diameter(root).d;

		}

		public DiaPair Diameter(TreeNode node) {
			if (node == null) {
				return new DiaPair();
			}
			DiaPair ldp = Diameter(node.left);
			DiaPair rdp = Diameter(node.right);
			DiaPair sdp = new DiaPair();
			sdp.h = Math.max(ldp.h, rdp.h) + 1;
			int d = ldp.h + rdp.h + 2;
			sdp.d = Math.max(d, Math.max(ldp.d, rdp.d));
			return sdp;

		}
	}

}
