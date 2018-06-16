package leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root==null) return false;
    	if(root.right==null&&root.left==null&&sum-root.val==0) return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
