package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RunCode {
	public static void main(String[] args) {
		ValidParentheses test = new ValidParentheses();
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
	    System.out.println(test.isValid("[{[)}]"));
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
