//143. Reorder List
public class reorderList {
    class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = reverse(slow.next,null); //slow.next is given instead of slow
        slow.next = null; //This is essential to disconnect the first half!!

        mergeRecursive(firstHalf,secondHalf);

        
    }   
    private void mergeRecursive(ListNode first, ListNode second) {
        if (second==null) return;

        ListNode temp1 = first.next;
        ListNode temp2 = second.next;

        first.next = second;
        second.next = temp1;

        mergeRecursive(temp1, temp2);
    }


    public ListNode reverse(ListNode curr, ListNode prev){

        if(curr==null){
            return prev;
        }

        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next,curr);
    }

}
}
