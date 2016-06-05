package Leetcode;

public class RemoveNfromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head == null) return head;
	        ListNode tmp = head;
	        ListNode p1 = head;
	        ListNode p2 = head;
	        int count = 0;
	        while(tmp.next != null){
	            tmp = tmp.next;
	            count ++;
	            if(count >= n) {p2 =p1; p1 = p1.next;}
	        }
	        if(count == 0 && n==1) return null;
	        else if (count == n-1) return head.next;
	        else if(n==1) p2.next = null;
	        else  p2.next = p1.next;
	        return head;
	    }
}
