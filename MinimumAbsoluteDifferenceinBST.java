package leetcode;

public class MinimumAbsoluteDifferenceinBST {
	
    int minDifference = Integer.MAX_VALUE;
    TreeNode temp;
    
    public int getMinimumDifference(TreeNode root) {
    	
    	inOrderTraversal(root);
    	
        return minDifference;
    }
    
    public void inOrderTraversal(TreeNode root) {
    	if(root!=null) {
        	inOrderTraversal(root.left);
        	if(temp!=null) {
        		minDifference = Math.min(minDifference, root.val-temp.val);
        	}
        	temp = root;
        	inOrderTraversal(root.right);
    	}
    }
    
}
