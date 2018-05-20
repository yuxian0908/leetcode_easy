package leetcode;

public class SumofLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int result = 0;
		if(root.left!=null) {
			if(root.left.left==null&&root.left.right==null) {
				result = result+root.left.val;
			}else {
				result = sumOfLeftLeaves(root.left);
			}
		}
		result = result+sumOfLeftLeaves(root.right);
		
        return result;
    }
}
