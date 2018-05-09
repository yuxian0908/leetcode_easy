package leetcode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
    	
    	ListNode fast = head;
    	ListNode slow = head;
    	System.out.println(head);
    	while(fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	if(fast!=null) {
    		slow = slow.next;
    	}
    	
    	slow = reverse(slow);
    	fast = head;
    	
    	while(slow!=null) {
    		if(slow.val!=fast.val) {
    			return false;
    		}
    		slow = slow.next;
    		fast = fast.next;
    	}
    	
    	
        return true;
    }
    
    public ListNode reverse(ListNode head) {

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
