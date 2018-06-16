package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root==null) return new ArrayList<>();
    	
        Queue<TreeNode> store = new LinkedList<>();
        List<List<Integer>> resultAry = new ArrayList<>();
        
        store.offer(root);
        
        while(!store.isEmpty()) {
        	int levelNum = store.size();
            List<Integer> result = new ArrayList<>();
        	for(int i=0; i<levelNum; i++) {
        		TreeNode temp = store.poll();
        		if(temp.left!=null) {
        			store.offer(temp.left);
        		}
        		if(temp.right!=null) {
        			store.offer(temp.right);
        		}
        		result.add(temp.val);
        	}
        	resultAry.add(0, result);
        }
                
        return resultAry;
    }
}
