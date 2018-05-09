package leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

    	ListNode temp = new ListNode(0);
    	ListNode store = head;
    	ListNode result = null;
    	
    	while(store!=null) {
    		temp = store;
    		store = store.next;
    		temp.next = result;
    		result = temp;
    	 }
    	
        return result;
    }
}
