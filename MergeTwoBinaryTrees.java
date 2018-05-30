package leetcode;

import java.util.Stack;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	if(t1==null&&t2==null) return null;
    	
    	int val = (t1==null?0:t1.val)+(t2==null?0:t2.val);
    	TreeNode newNode = new TreeNode(val);
    	
    	newNode.left = mergeTrees(t1==null?null:t1.left,t2==null?null:t1.left);
    	newNode.right = mergeTrees(t1==null?null:t1.right,t2==null?null:t1.right);
    	
    	return newNode;
    }    
}
