public class removeNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node is essential to simplify edge cases like removing the head, otherwise
        //you'll have to manually code edge cases seperately!!
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n+1 steps so there's a gap of n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
