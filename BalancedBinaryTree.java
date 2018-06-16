package leetcode;

public class BalancedBinaryTree {
	boolean flag;
    public boolean isBalanced(TreeNode root) {
    	flag = true;
    	judge(root);
    	return flag;
    }
    private int judge(TreeNode node) {
    	if(node==null) return 0;
    	int leftLen = 1+judge(node.left);
    	int rightLen = 1+judge(node.right);

    	if(Math.abs(leftLen-rightLen)>1) {
    		flag = false;
    		return -1;
    	}
    	
    	return Math.max(leftLen, rightLen);
    }
}
