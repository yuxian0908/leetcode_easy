package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
    	if(root==null) return 0;
    	int depth = 0;
    	Queue<TreeNode> store = new LinkedList<>();
    	store.offer(root);
    	
    	while(!store.isEmpty()) {
    		int size = store.size();
    		depth++;
    		for(int i=0; i<size; i++) {
        		TreeNode temp = store.poll();
    			if(temp.left!=null) store.offer(temp.left);
    			if(temp.right!=null) store.offer(temp.right);
    		}
    	}
        return depth;
    }
}
