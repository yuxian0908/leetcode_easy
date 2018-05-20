package leetcode;

public class LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            	
    	if(root==null) {
    		return null;
    	}
    	
    	if(p.val<root.val&&q.val<root.val) {
    		return lowestCommonAncestor(root.left,p,q);
    	}
    	
    	if((p.val-root.val)*(q.val-root.val)<0||p.val==root.val||q.val==root.val) {
    		return root;
    	}

		return lowestCommonAncestor(root.right,p,q);
    }
}
