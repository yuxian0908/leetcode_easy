package leetcode;

import java.util.HashSet;

public class LinkedListCycle {
//	public boolean hasCycle(ListNode head) {
//		//use two pointer
//        if(head == null) {
//            return false;
//        }
//        ListNode slowNode = head;
//        ListNode fastNode = head.next;
//
//        while(fastNode!=null && fastNode.next!=null && slowNode!= fastNode) {
//            slowNode = slowNode.next;
//            fastNode = fastNode.next.next;
//        }
//        return slowNode== fastNode;
//    }
	public boolean hasCycle(ListNode head) {
		
		HashSet<ListNode> store = new HashSet<>();
		ListNode temp = head;
		
		while(temp!=null) {
			
			if(store.contains(temp)) {
				return true;
			}
			
			store.add(temp);
			temp = temp.next;
		}
		
		return false;
    }
}
