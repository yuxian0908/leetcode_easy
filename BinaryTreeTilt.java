package leetcode;

public class BinaryTreeTilt {
	int totalDif = 0;
    public int findTilt(TreeNode root) {
    	dif(root);
        return totalDif;
    }
    
    private int dif(TreeNode root) {
    	if(root==null) return 0;
    	
    	int left = dif(root.left);
    	int right = dif(root.right);
    	totalDif+=Math.abs(left-right);
    	
    	return left+right+root.val;
    }
}
