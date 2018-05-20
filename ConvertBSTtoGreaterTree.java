package leetcode;

public class ConvertBSTtoGreaterTree {
	int sum=0;
    public TreeNode convertBST(TreeNode root) {
    	
    	if(root==null) {
    		return null;
    	}
    	
    	convertBST(root.right);    	
    	int temp = sum;
    	sum=sum+root.val;
    	root.val = root.val+temp;

    	convertBST(root.left);
    	
        return root;
    }
}
