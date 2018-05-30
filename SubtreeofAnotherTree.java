package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
        String sStr = genpreorderString(s); 
        String tStr = genpreorderString(t);
        return sStr.contains(tStr);
    }
    public String genpreorderString(TreeNode s){
    	Stack<TreeNode> store = new Stack<>();
    	StringBuilder sb = new StringBuilder();
    	store.push(s);
    	while(!store.isEmpty()) {
    		TreeNode temp = store.pop();    		
    		if(temp==null) {
    			sb.append(",#");
    		}else {
    			sb.append(","+temp.val);
    		}
    		
    		if(temp!=null) {
    			store.push(temp.left);
    			store.push(temp.right);
    		}
    	}
    	return sb.toString();
    }
}
