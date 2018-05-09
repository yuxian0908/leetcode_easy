package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode result = new ListNode(0);
    	ListNode temp = result;
    	
    	while(l1!=null&&l2!=null) {
    		if(l1.val<=l2.val) {
    			temp.next = l1;
    			l1 = l1.next;
    		}else {
    			temp.next = l2;
    			l2 = l2.next;
    		}
			temp = temp.next;
    	}
    	if (l1 != null) {
    		temp.next = l1;
        }
        if (l2 != null) {
        	temp.next = l2;
        }
    	
        return result.next;
    }
}

//
//class ListNode {
//	int val;
//	ListNode next;
//	ListNode(int x) { val = x; }
//	
//	public boolean hasNext() {
//		return this.next!=null;
//	}
//	public String toString(){
//		ListNode temp = this;
//		String result = ""+this.val;
//		while(temp.hasNext()) {
//			temp = temp.next;
//			result = result+"->"+temp.val;
//		}
//		return result;
//	}
//}
