package leetcode;

public class SortList {	
}


class quickSort {
	ListNode sortList(final ListNode h){
		//quick sort
	    if(h == null || h.next == null)
	        return h;
	    
	    /*split into three list*/
	    ListNode fakesmall = new ListNode(0), small = fakesmall;
	    ListNode fakelarge = new ListNode(0), large = fakelarge;
	    ListNode fakeequal = new ListNode(0), equal = fakeequal;
	    
	    ListNode cur = h; // pivot is h.
	    while(cur != null){
	        if(cur.val < h.val){
	            small.next = cur;
	            small = small.next;
	        }
	        else if(cur.val == h.val){
	            equal.next = cur;
	            equal = equal.next;
	        }
	        else{
	            large.next = cur;
	            large = large.next;
	        }
	        
	        cur = cur.next;
	    }
	    
	    // put an end.
	    small.next = equal.next = large.next = null;
	    // merge them and return . merge reusing below one. merge for quicksort should be simplified. 
	    return merge(merge(sortList(fakesmall.next), sortList(fakelarge.next)),fakeequal.next) ;
	}
	ListNode merge(ListNode h, ListNode m){
	    ListNode fake = new ListNode(0), cur = fake;
	    
	    while(h != null && m != null){

	        if(h.val < m.val){
	            cur.next = h;
	            h = h.next;
	        }
	        else{
	            cur.next = m;
	            m = m.next;
	        }
	        cur = cur.next;
	    }
	    
	    cur.next = (h == null ? m : h);
	    
	    return fake.next;
	}
}


class mergeSort {
	public ListNode sortList(ListNode head) {
		//merge sort
		if(head==null||head.next==null) {
			return head;
		}
		
		ListNode middle = getMiddle(head);
		ListNode sHalf = middle.next;
		middle.next = null;
		
		
		return merge(sortList(head), sortList(sHalf));
	}
	
	public ListNode merge(ListNode fHalf, ListNode sHalf) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while(fHalf!=null&&sHalf!=null) {
			if(fHalf.val<sHalf.val) {
				cur.next = fHalf;
				fHalf = fHalf.next;
			}else {
				cur.next = sHalf;
				sHalf = sHalf.next;
			}
			cur = cur.next;
		}
		
		cur.next = (fHalf==null)?sHalf:fHalf;
		
		return dummy.next;
	}
	
	public ListNode getMiddle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}		
		return slow;
	}
}


class bubbleSort {
	  public ListNode sortList(ListNode head) {
	  //bubble sort
		if(head==null) {
			return null;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pointer = head;
		ListNode pointerNow = head;
		
		while(pointer.next!=null) {
			pointerNow = head;
			while(pointerNow.next!=null) {
				if(pointerNow.val>pointerNow.next.val) {
	  			int temp = pointerNow.val;
	  			pointerNow.val = pointerNow.next.val;
	  			pointerNow.next.val = temp;
	  		}
	  		pointerNow = pointerNow.next;
			}
			pointer = pointer.next;
		}
		return dummy.next;
	}
}


class insertionSort {
		public ListNode sortList(ListNode head) {
		//insertion sort
		if(head==null) {
			return null;
		}
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pointer = head;
		
		while(pointer.next!=null) {
			if(pointer.val>pointer.next.val) {
				ListNode start = dummy;
				ListNode temp = pointer.next;
				pointer.next = pointer.next.next;
				
				while(start.next.val<temp.val) {
					start = start.next;
				}
				
				temp.next = start.next;
				start.next = temp;
				
			}else {
	  		pointer = pointer.next;
			}
		}
		return dummy.next;
	}
}
