/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * 
 * Solution: two pointer, quick and slow 
 * 
 * @author caomi
 *
 */
public class RemoveListEle {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode currentNode = head;
        ListNode previousNode = null;
        while(currentNode.next != null){
            if(currentNode.val == val){
                // remove the node
                if(previousNode != null){
                    // will not change the head
                    previousNode.next = currentNode.next;
                }
                else{
                    head = currentNode.next;
                }
            } else{
            //move to next node
            previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        // The last node
        if(currentNode.val == val && previousNode !=null) previousNode.next =null;
        else if(currentNode.val == val) head = null;
        return head;
    }
}
