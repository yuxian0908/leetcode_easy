package leetcode;

import java.util.Arrays;

public class RunCode {
	public static void main(String[] args) {
		PalindromeLinkedList test = new PalindromeLinkedList();
	    System.out.println("test code");
	    
	    int[] Ary1= new int[] {1,2,1,2,3,3,2,1,2,1};
	    int[] Ary2= new int[] {2};
	    
	    ListNode test1= new ListNode(0);
	    ListNode test2= new ListNode(0);

	    ListNode temp1= test1;
	    ListNode temp2= test2;
	    
	    for(int i:Ary1) {
	    	temp1.next = new ListNode(i);
	    	temp1 = temp1.next;
	    }
	    for(int i:Ary2) {
	    	temp2.next = new ListNode(i);
	    	temp2 = temp2.next;
	    }
	    
	    System.out.println(test.isPalindrome(test1.next));
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
