package Lec37;


public class SumRoottoLeafNumbers {

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
	    public int sumNumbers(TreeNode root) {
	    	 return sumnumber(root,0);
	        
	    }

		private int sumnumber(TreeNode root, int sum) {
			// TODO Auto-generated method stub
			if(root==null) {
				return 0;
			}
			if(root.left==null && root.right==null) {
				return sum*10+root.val;
			}
			
			int l = sumnumber(root.left, sum*10+root.val);
			int r = sumnumber(root.right, sum*10+root.val);
			return l+r;
		}
	}
}
