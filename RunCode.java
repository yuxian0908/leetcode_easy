package leetcode;

import java.util.Arrays;

public class RunCode {
	public static void main(String[] args) {
		IntersectionofTwoLinkedLists test = new IntersectionofTwoLinkedLists();
	    System.out.println("test code");
	    
	    int[] Ary1= new int[] {1,3,5,7,9,11,13,15,17,19,21};
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
	    System.out.println(test1);
	    System.out.println(test2);

	    System.out.println("===================");
	    
	    System.out.println(test.getIntersectionNode(test1.next,test2.next).toString());
	 }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
		next = null;
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
