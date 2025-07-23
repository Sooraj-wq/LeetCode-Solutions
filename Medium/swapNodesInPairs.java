//24. Swap Nodes in Pairs
public class swapNodesInPairs {
    class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next); //Note that only one node is required to be passed in this recursion unlike other problems where both curr and next nodes have to be passed
        second.next = first;

        return second;
    }
}
}
