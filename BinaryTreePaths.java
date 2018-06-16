package leetcode;

import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	
    	List<String> res = new LinkedList<>();
    	Stack<TreeNode> store = new Stack<>();
    	Stack<String> storeStr = new Stack<>();
    	
    	if(root==null) return res;
    	store.push(root);
    	storeStr.push("");
    	
    	while(!store.isEmpty()) {
    		TreeNode temp = store.pop();
    		String tempStr = storeStr.pop();
    		
    		if(temp.left==null&&temp.right==null) {
    			res.add(tempStr+temp.val);
    		}
    		
    		if(temp!=null) {
    			if(temp.right!=null) {
    				store.push(temp.right);
    				storeStr.push(tempStr+temp.val+"->");
    			}
    			if(temp.left!=null) {
    				store.push(temp.left);
    				storeStr.push(tempStr+temp.val+"->");
    			}
    		}
    	}
    	
        return res;
    }
}
