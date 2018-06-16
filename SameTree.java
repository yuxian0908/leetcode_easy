package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class SameTree {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	    	Stack<TreeNode> storeP = new Stack<>();
	    	Stack<TreeNode> storeQ = new Stack<>();    	
	    	
	    	storeP.push(p);
	    	storeQ.push(q);
	    	
	    	while(!storeP.isEmpty()||!storeQ.isEmpty()) {
	    		if(storeP.isEmpty()||storeQ.isEmpty())
	    			return false;
	    		TreeNode tempP = storeP.pop();
	    		TreeNode tempQ = storeQ.pop();
	            if(tempP!=null&&tempQ!=null) {
	                if(tempP.val!=tempQ.val)
	                    return false;
	            }else if((tempP!=null&&tempQ==null)||(tempP==null&&tempQ!=null)){
	                return false;
	            }
	    		if(tempP!=null) {
					storeP.push(tempP.right);
					storeP.push(tempP.left);
	    		}
	            if(tempQ!=null){
					storeQ.push(tempQ.right);
					storeQ.push(tempQ.left);
	            }
	    	}
	        return true;
	    }
}
