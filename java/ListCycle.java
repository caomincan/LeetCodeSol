package Leetcode;

public class ListCycle {
	  public boolean hasCycle(ListNode head) {
	        ListNode p1 = head;
	        ListNode p2 = head;
	        int count =0;
	        while(p1 != null){
	            p1 = p1.next;
	            count++;
	            if(p1 == p2) return true;
	            if(count %3 == 0) p2 = p2.next;
	        }
	        return false;
	    }
}
