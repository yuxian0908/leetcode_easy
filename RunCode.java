package leetcode;

import java.util.Arrays;

public class RunCode {
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();
	    System.out.println("test code");
	    
	    ListNode test1= new ListNode(6);
	    test1.next = new ListNode(6);
	    test1.next.next = new ListNode(8);
	    test1.next.next.next = new ListNode(8);
	    test1.next.next.next.next = new ListNode(9);
	    ListNode test2= new ListNode(3);
	    test2.next = new ListNode(4);
	    test2.next.next = new ListNode(5);
	    
	    System.out.println(test.deleteDuplicates(test1).toString());
	 }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
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
