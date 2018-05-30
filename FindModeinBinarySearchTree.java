package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindModeinBinarySearchTree {
	HashMap<Integer, Integer> store;
	int max = 0;
	
    public int[] findMode(TreeNode root) {
    	if(root==null) return new int[0];
    	this.store = new HashMap<>();
    	
    	traverse(root);    	
    	
    	List<Integer> result = new LinkedList<>();
    	
    	for(int key : store.keySet()) {
    		if(store.get(key)==max)result.add(key);
    	}
    	
    	int[] res = new int[result.size()];
    	for(int i=0; i<result.size(); i++) {
    		res[i] = result.get(i);
    	}
    	
        return res;
    }
    
    private void traverse(TreeNode root) {
    	if(root.left!=null)traverse(root.left);
    	store.put(root.val, store.getOrDefault(root.val, 0)+1);
    	max = Math.max(max, store.get(root.val));
    	if(root.right!=null)traverse(root.right);
    }
}
