package leetcode;

public class SecondMinimumNodeInaBinaryTree {
	

    public int findSecondMinimumValue(TreeNode root) {
    	if(root.left==null&&root.right==null) {
    		return -1;
    	}

    	int left = root.left.val>root.val?root.left.val:findSecondMinimumValue(root.left);
    	int right = root.right.val>root.val?root.right.val:findSecondMinimumValue(root.right);
    	
    	if(left>=0&&right>=0) {
    		return Math.min(left, right);
    	}else {
    		return Math.max(left, right);
    	}
    	
    }
}
