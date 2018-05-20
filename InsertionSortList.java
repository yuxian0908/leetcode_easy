package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if(head==null) {
			return null;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pointer = head;
		
		while(pointer.next!=null) {
			if(pointer.val>pointer.next.val) {
				ListNode start = dummy;
				ListNode toAjust = pointer.next;
				pointer.next = pointer.next.next;
				
				while(start.next.val<toAjust.val) {
					start = start.next;
				}
				toAjust.next = start.next;
				start.next = toAjust;
			}else {
				pointer = pointer.next;
			}
		}
		
		
        return dummy.next;
    }
}
