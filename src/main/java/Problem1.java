public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copy(l2);
        }

        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }

        ListNode l2Current = l2;
        while (l2Current != null) {
            current.next = new ListNode(l2Current.val); 
            current = current.next; 
            l2Current = l2Current.next; 
        }

        return l1; 
    }

    private static ListNode copy(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode originalCurrent = head.next;

        // Iterate through the original list and create a copy
        while (originalCurrent != null) {
            current.next = new ListNode(originalCurrent.val);
            current = current.next;
            originalCurrent = originalCurrent.next;
        }

        return newHead; 
    }
    
}
