package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> store = new LinkedList<>();
        
        store.offer(root);
        
        while(!store.isEmpty()) {
        	int num = store.size();
        	double sum = 0.0;
        	for(int i=0; i<num; i++) {
            	TreeNode temp = store.poll();
            	sum = sum+temp.val;
        		if(temp.left!=null) {
        			store.offer(temp.left);
        		}
        		if(temp.right!=null) {
        			store.offer(temp.right);
        		}
        	}
    		result.add(sum/num);
        }
        
        return result;
    }
}
