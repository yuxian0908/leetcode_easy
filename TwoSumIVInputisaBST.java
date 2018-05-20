package leetcode;

import java.util.HashSet;

public class TwoSumIVInputisaBST {
	HashSet<Integer> store = new HashSet<>();
	boolean result = false;
    public boolean findTarget(TreeNode root, int k) {
    	if(root==null)return false;
    	findTarget(root.left,k);
    	
    	System.out.println(root.val);
    	
    	if(store.contains(k-root.val)) {
    		result = true;
    	}
    	store.add(root.val);
    	
		findTarget(root.right,k);
		return result;
    }
}
