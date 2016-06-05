package Leetcode;

public class DeleteANode {
    public void deleteNode(ListNode node) {
        if(node == null) return;
        int temp = node.next.val;
        node.val=temp;
        node.next = node.next.next;
    }
}
