package leetcode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode ptr = new ListNode(Integer.MAX_VALUE);
    	ListNode temp = ptr;
    	
    	while(head!=null) {
    		if(temp.val!=head.val) {
    			temp.next = head;
    			temp = temp.next;
        		head = head.next;
    			temp.next = null;
    		}else {
        		head = head.next;
    		}
    	}
    	
        return ptr.next;
    }
}
