
 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return null;
        }

        if(head.val == val){
            head = removeElements(head.next, val);
        }else{
            head.next = removeElements(head.next, val);
        }
        return head;
    }
}