package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RunCode {
	public static void main(String[] args) {
		MergeTwoBinaryTrees test = new MergeTwoBinaryTrees();
	    System.out.println("test code");
	    
//	    int[] Ary1= new int[] {3,2,8,5,7,0};
//	    
//	    ListNode test1= new ListNode(0);
//
//	    ListNode temp1 = test1;
//	    
//	    for(int i:Ary1) {
//	    	temp1.next = new ListNode(i);
//	    	temp1 = temp1.next;
//	    }
//	    System.out.println(test1.next.toString());
	    
	    TreeNode test1 = new TreeNode(10);
	    test1.left = new TreeNode(7);
	    test1.left.left = new TreeNode(3);
	    test1.left.right = new TreeNode(8);
	    test1.right = new TreeNode(12);
	    
	    TreeNode test2 = new TreeNode(7);
	    test2.left = new TreeNode(3);
	    test2.right = new TreeNode(8);
	    test2.right.left = new TreeNode(8);
	    
	    System.out.println(test.mergeTrees(test1,test2));
	 }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x;
	}
	
	public boolean hasNext() {
		return this.next!=null;
	}
	public String toString(){
		ListNode temp = this;
		String result = ""+this.val;

		while(temp.hasNext()) {
			temp = temp.next;
			result = result+"->"+temp.val;
		}
		return result;
	}
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
