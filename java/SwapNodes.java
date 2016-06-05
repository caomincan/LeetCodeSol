package Leetcode;

public class SwapNodes {
	 public ListNode swapPairs(ListNode head) {
	        if(head == null|| head.next == null ) return head;
	        ListNode nxt = head.next;
	        ListNode nxt2 = nxt.next;
	        nxt.next = head;
	        head.next = swapPairs(nxt2);
	        return nxt;
	    }
}
