public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secHalf = reverse(null,slow);
        ListNode firstHalf = head;

        while(secHalf!=null){
            if(secHalf.val != firstHalf.val){
                return false;
            }
            secHalf = secHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }
    
    public ListNode reverse(ListNode prev,ListNode curr){
        if(curr == null){
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(curr,next);

    }

}
