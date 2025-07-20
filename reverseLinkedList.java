/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class reverseLinkedList{
    public ListNode reverseList(ListNode head) {

        return reverse(head,null);

    }

    public ListNode reverse(ListNode curr, ListNode prev){

        if(curr==null){
            return prev; //Previous node is returned, not the curr node!
        }

        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next,curr);
    }
}