package leetcode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
    	if(root==null) {
    		return null;
    	}
    	TreeNode tempLeft = root.left;
    	TreeNode tempRight = root.right;
    	System.out.println(TreeNode.show(root));
    	
    	root.right = invertTree(tempLeft);
    	root.left = invertTree(tempRight);
    	
        return root;
    }
}
