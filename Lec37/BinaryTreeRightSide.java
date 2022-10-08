package Lec37;

import java.util.*;

public class BinaryTreeRightSide {

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
		int pl = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			RightView(root, 0, ll);
			return ll;

		}

		public void RightView(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (pl < cl) {
				// print ka kaam

				ll.add(root.val);
				pl = cl;
			}
			RightView(root.right, cl + 1, ll);
			RightView(root.left, cl + 1, ll);

		}
	}

}
